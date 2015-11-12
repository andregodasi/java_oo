/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7exerciciocontatoamdre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRE
 */
public class ContadoDAO {
    
    public void adiciona(Contato contato) {
        String sql = "insert into contato "
                + "(nome,telefone)"
                + " values (?,?)";

        try {
            Connection con = ConnectionFactory.getConnection();
        // seta os valores
            // prepared statement para inserção
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // seta os valores

                stmt.setString(1, contato.getNome());
                stmt.setInt(2, contato.getTelefone());

                // executa
                stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Contato> obterLista() {
     try (Connection con = ConnectionFactory.getConnection()){
         List<Contato> contatos = new ArrayList<Contato>();
         try (PreparedStatement stmt = con.
                 prepareStatement("select * from contato")) {
             ResultSet rs = stmt.executeQuery();
             
             while (rs.next()) {
                 // criando o objeto Contato
                 Contato contato = new Contato();
                 contato.setId(rs.getInt("id"));
                 contato.setNome(rs.getString("nome"));
                 contato.setTelefone(rs.getInt("telefone"));
            
                 // adicionando o objeto à lista
                 contatos.add(contato);
             }
             rs.close();
         }
         return contatos;
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
    
    public void altera(Contato contato) {
     String sql = "update contato set nome=?, telefone=? where id=?";
 
     try (Connection con = ConnectionFactory.getConnection()){
         PreparedStatement stmt = con.prepareStatement(sql);
         stmt.setString(1, contato.getNome());
         stmt.setInt(2, contato.getTelefone());
         stmt.setLong(3, contato.getId());
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
    
    public List<Contato> obterContato(int id) {
     try (Connection con = ConnectionFactory.getConnection()){
         List<Contato> contatos = new ArrayList<Contato>();
         try (PreparedStatement stmt = con.
                 prepareStatement("select * from contato where id =?")) {
             stmt.setLong(1, id);
             ResultSet rs = stmt.executeQuery();
             
             while (rs.next()) {
                 // criando o objeto Contato
                 Contato contato = new Contato();
                 contato.setId(rs.getInt("id"));
                 contato.setNome(rs.getString("nome"));
                 contato.setTelefone(rs.getInt("telefone"));
            
                 // adicionando o objeto à lista
                 contatos.add(contato);
             }
             rs.close();
         }
         return contatos;
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
    
    
    public void remove(Contato contato) {
     try (Connection con = ConnectionFactory.getConnection()){
         PreparedStatement stmt = con.prepareStatement("delete from contato where id=?");
         stmt.setLong(1, contato.getId());
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
}
