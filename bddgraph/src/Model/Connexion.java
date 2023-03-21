package Model;

import java.sql.SQLException;
import java.sql.*;

public class Connexion {
    static String url = "jdbc:mysql://localhost:3306/bddgraph";
    static String utilisateur = "root";
    static String motDePasse = "";

    public static Connection SeConnecter() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Error" + e.getMessage());

        }
        return conn;
    }
}