
package dao;

/**
 *
 * @author andre.silva
 */

import beans.Autor;
import beans.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.beans.*;

public class LivroDAO {

    private final String stmtInserir = "INSERT INTO livro(titulo) VALUES(?)";
    private final String stmtConsultar = "SELECT * FROM livro WHERE id = ?";
    private final String stmtListaLivroAutor = "SELECT * FROM livro";

      public void inserirLivro(Livro livro) {
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtInserir, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, livro.getTitulo());
            stmt.executeUpdate();
            livro.setId(lerIdLivro(stmt));
            System.out.println("Id Livro : "+livro.getId());
            
            if(livro.getAutores().size() > 0){
                String sql = "insert into livro_autor (idlivro , idautor) values (? ,?)";
                ArrayList<Autor> autores = new ArrayList(livro.getAutores());
                int c = 0 ,numAutores = autores.size();
                stmt2 = con.prepareStatement(sql);
                stmt2.setInt(1, livro.getId());
                while(c < numAutores){
                    stmt2.setInt(2 , autores.get(c).getId());
                    stmt2.execute();
                    c++;
                }
            }
            stmt2.close();
            } catch (SQLException ex) {
            try{con.rollback();}catch(SQLException ex1){System.out.println("Erro ao tentar rollback. Ex="+ex1.getMessage());};
            throw new RuntimeException("Erro ao inserir um livro no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
      
      
     private int lerIdLivro(PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getInt(1);
    }   

    public Livro consultarLivro(int id) {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtConsultar);
            Livro livroLido = null;
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
            if(!rs.next())
                throw new RuntimeException("Livro com id="+id+" não existe na base de dados.");
            ArrayList<Autor> listaAutores = lerAutores(id,con);
            livroLido = new Livro(rs.getString("titulo"), listaAutores);
            livroLido.setId(rs.getInt("id"));
            return livroLido;           
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao consultar um livro no banco de dados. Origem="+ex.getMessage());            
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar rs. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};            
        }

    }

    private void gravarAutores(Livro livro, Connection con) throws SQLException {
        String sql = "INSERT INTO livro_autor (idlivro, idautor) VALUES ( ?, ?)";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, livro.getId());
        List<Autor> autores = livro.getAutores();
        for (Autor autor : autores) {
            stmt.setLong(2, autor.getId());
            stmt.executeUpdate();
        }
    }

    private ArrayList<Autor> lerAutores(long idLivro, Connection con) throws SQLException{
        //Select para pegar os autores de um livro
        String sql = "SELECT autor.id,autor.nome"
                + " FROM autor"
                + " INNER JOIN livro_autor"
                + " 	ON autor.id = livro_autor.idautor"
                + " WHERE livro_autor.idlivro = ? ";
        PreparedStatement stmt = null;
        ArrayList<Autor> autores = null;
        stmt = con.prepareStatement(sql);
        stmt.setLong(1, idLivro);
        ResultSet resultado = stmt.executeQuery();
        autores = new ArrayList<Autor>();
        while (resultado.next()) {
            Autor autorLido = new Autor(resultado.getString("nome"));
            autorLido.setId(resultado.getInt("id"));
            autores.add(autorLido);
        }

        return autores;
    }



    public ArrayList<Livro> listarLivroComAutores() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtListaLivroAutor);            
            rs = stmt.executeQuery();
            ArrayList<Livro> listaLivros = new ArrayList();
            
            while (rs.next()) {
                ArrayList<Autor> listAutores = lerAutores(rs.getInt(1),con);
                Livro livro = new Livro(rs.getString(2), listAutores);
                livro.setId(rs.getInt(1));
                listaLivros.add(livro);
            }
            return listaLivros;            
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao listar um livro com autores no banco de dados. Origem="+ex.getMessage());            
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar rs. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};                
        }
    }
    
    public boolean verificaIdLivro(int idLivro) throws SQLException{
        String sql = "select id from livro";
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conexao = new ConnectionFactory().getConnection();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getInt("id") == idLivro){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println("Erro na pesquisa do idLivro!!!");
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            conexao.close();
        }        
    }
    
    public ArrayList<Livro> listaLivrosDeAutor(int idaAutor){
        String sql = " select l.titulo\n" +
                     "      , l.id    \n" +
                     " from livro_autor la\n" +
                          " inner join autor a on a.id = la.idautor\n" +
                          " inner join livro l on l.id = la.idlivro\n" +
                    " where a.id = ?";
        ArrayList<Livro> listaLivro = new ArrayList();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = new ConnectionFactory().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idaAutor);
            rs = stmt.executeQuery();

            while(rs.next()){
                Livro livro = new Livro();
                
                String titulo = rs.getString("titulo");
                System.out.println(titulo);
                int id = rs.getInt("id");
                livro.setTitulo(titulo);
                livro.setId(id);
                listaLivro.add(livro);
            }
            return listaLivro;
        } catch (SQLException e) {
            System.out.println("Erro no metodolistarLivroDeAutor LivroDAO");
            throw new RuntimeException();
        }
    }
}
