package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {
    public int CheckLogin(String login, String password) throws SQLException {

        ResultSet resultat = null;
        Connection conn = null;
        java.sql.PreparedStatement pstmt;

        int nombre = 0;
        try{
            conn = Connexion.SeConnecter();
            String requ = "Select count(*) AS nombre from utilisateur where login  = ? and password = ?";
            pstmt = conn.prepareStatement(requ);
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            resultat = pstmt.executeQuery();
            while (resultat.next()){
                nombre = resultat.getInt(1);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return nombre;
    }
}
