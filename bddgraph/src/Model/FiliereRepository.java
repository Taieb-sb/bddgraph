package Model;

import java.sql.*;

public class FiliereRepository {
    private PreparedStatement pStmt = null;
    private Statement stmt = null;
    ResultSet resultat = null;
    Connection conn = null;

    public ResultSet getFiliere() throws SQLException{
        String requ = "Select idFil, nom from filiere";
        try{
            conn = Connexion.SeConnecter();
            stmt = conn.createStatement();
            resultat = stmt.executeQuery(requ);
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return resultat;
    }
}
