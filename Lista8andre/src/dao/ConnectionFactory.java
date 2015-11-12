
package dao;

/**
 *
 * @author andre.silva
 */
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author joaofelipelopes
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/livro_autor", "postgres", "andre1437");

    }
}