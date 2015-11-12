
package dao;

/**
 *
 * @author andre.silva
 */

import beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {

    private final String stmtInserir = "INSERT INTO autor(nome) VALUES(?)";
    private final String stmtConsultar = "SELECT * FROM autor WHERE id = ?";
    private final String stmtListar = "SELECT * FROM autor";

    public void inserirAutor(Autor autor) {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtInserir,PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, autor.getNome());
            stmt.executeUpdate();
            autor.setId(lerIdAutor(stmt));
            System.out.println("ID DO AUTOR DAO :"+autor.getId());
            String sql = "insert into livro_autor (idAutor ,idLivro) values (? ,?)";
            List<Livro> livros = autor.getLivros();
            int c = 0 ,numLivros = livros.size();
            stmt2 = con.prepareStatement(sql);
            stmt2.setInt(1, autor.getId());
            while(c < numLivros){   
                stmt2.setInt(2, livros.get(c).getId());
                stmt2.execute();
                c++;
            }
            stmt2.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir um autor no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{stmt.close();}catch(SQLException ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(SQLException ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
     }
    
    private int lerIdAutor(PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getInt(1);
    }

    public Autor consultarAutor(int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Autor autorLido;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtConsultar);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                autorLido = new Autor(rs.getString("nome"));
                autorLido.setId(rs.getInt("id"));
                return autorLido;
            }else{
                throw new RuntimeException("Não existe autor com este id. Id="+id);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao consultar um autor no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }

    public ArrayList<Autor> listarAutores() throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Autor> lista = new ArrayList();
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtListar);
            rs = stmt.executeQuery();
            while(rs.next()){
                Autor autor = new Autor(rs.getString("nome"));
                autor.setId(rs.getInt("id"));
                lista.add(autor);
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao consultar uma lista de autores. Origem="+ex.getMessage());
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};               
        }

    }

    public boolean verificaAutor(int idAutor) throws SQLException{
        String sql = "select id from autor";
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = new ConnectionFactory().getConnection();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getInt("id") == idAutor){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException();
        }finally{
            rs.close();
            stmt.close();
            conexao.close();
        }
    }
    
    public ArrayList<Autor> listarAutoresComLivro(){
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtListar);            
            rs = stmt.executeQuery();
            ArrayList<Autor> listaAutor = new ArrayList();
            while (rs.next()) {
                System.out.println("-->");
                ArrayList<Livro> listLivro = lerLivros(rs.getInt(1),con);
                System.out.println("------->");
                Autor autor = new Autor(rs.getString(2), listLivro);
                autor.setId(rs.getInt(1));
                listaAutor.add(autor);
            }
               return listaAutor;            
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao listar um livro com autores no banco de dados. Origem="+ex.getMessage());            
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar rs. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};                
        }

    }
    
    private ArrayList<Livro> lerLivros(long idAutor, Connection con) throws SQLException{
        //Select para pegar os autores de um livro
        String sql = "SELECT livro.id,livro.titulo"
                + " FROM autor"
                + " INNER JOIN livro_autor"
                + " 	ON autor.id = livro_autor.idAutor"
                + " INNER JOIN livro on livro.id = livro_autor.idlivro"
                + " WHERE livro_autor.idautor = ? ";
        PreparedStatement stmt = null;
        ArrayList<Livro> listaLivro = null;
        stmt = con.prepareStatement(sql);
        stmt.setLong(1, idAutor);
        ResultSet resultado = stmt.executeQuery();
        listaLivro = new ArrayList<Livro>();
        while (resultado.next()) {
            Livro livroLido = new Livro(resultado.getString("titulo"));
            livroLido.setId(resultado.getInt("id"));
            listaLivro.add(livroLido);
        }
        return listaLivro;
    }
}
