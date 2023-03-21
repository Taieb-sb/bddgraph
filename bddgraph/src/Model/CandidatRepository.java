package Model;

import javax.swing.*;
import java.sql.*;

public class CandidatRepository {

    private PreparedStatement pstmt = null;
    private Statement stmt = null;
    ResultSet resultat = null;
    Connection conn = null;

    public ResultSet getCandidat() throws SQLException {

        String requ = "Update etudiant Set nom = ?, prenom = ?, dateNaiss = ?, lieuNaiss = ?" +
                "sexe = ?,nationalite = ?, rue = ?, cp = ?, telephone = ?, mail=?, niveau = ?" +
                "idFil = ?, idBac = ? where idEtu = ?";

        String nom ="";
        String prenom= "";
        String dateNaiss="";
        String lieuNaiss="";
        String sexe="";
        String nationalite="";
        String rue="";
        String cp="";
        String telephone="";
        String mail="";
        String niveau="";
        int idFil=0;
        int idBac=0;

        try {
            conn = Connexion.SeConnecter();
            pstmt = (PreparedStatement) conn.prepareStatement(requ);

            pstmt.setString(1, nom);
            pstmt.setString(2, prenom);
            pstmt.setString(3, dateNaiss);
            pstmt.setString(4, lieuNaiss);
            pstmt.setString(5, sexe);
            pstmt.setString(6, nationalite);
            pstmt.setString(7, rue);
            pstmt.setString(8, cp);
            pstmt.setString(9, telephone);
            pstmt.setString(10, mail);
            pstmt.setString(11, niveau);
            pstmt.setInt(12, idFil);
            pstmt.setInt(13, idBac);

            stmt.executeUpdate(requ);
            JOptionPane.showMessageDialog(null,"Updated");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return (ResultSet) stmt;
    }

    public void ajtEtudiant(Connexion connexion){
        String nom ="";
        String prenom= "";
        String dateNaiss="";
        String lieuNaiss="";
        String sexe="";
        String nationalite="";
        String rue="";
        String cp="";
        String telephone="";
        String mail="";
        String niveau="";
        int idFil=0;
        int idBac=0;

        String requ = "INSERT INTO";
        try {
            conn = Connexion.SeConnecter();
            pstmt = (PreparedStatement) conn.prepareStatement(requ);

            pstmt.setString(1, nom);
            pstmt.setString(2, prenom);
            pstmt.setString(3, dateNaiss);
            pstmt.setString(4, lieuNaiss);
            pstmt.setString(5, sexe);
            pstmt.setString(6, nationalite);
            pstmt.setString(7, rue);
            pstmt.setString(8, cp);
            pstmt.setString(9, telephone);
            pstmt.setString(10, mail);
            pstmt.setString(11, niveau);
            pstmt.setInt(12, idFil);
            pstmt.setInt(13, idBac);

            pstmt.executeUpdate(requ);
            JOptionPane.showMessageDialog(null,"insertion d'un etudiant");
        }catch (SQLException e){
            System.out.println("ERROR");
        }
    }

    public void deleteCandidat(int id){
        String requ = "Delete from etudiant where idEtud = ?";
        try{
            conn = Connexion.SeConnecter();
            pstmt.executeUpdate(requ);
        }catch (SQLException e){
            System.out.println("ERROR");
        }
    }
        /*

            while (resultat.next()) {
                System.out.println("nom : " + resultat.getString("a_nom") + " "
                        + "prenom : " + resultat.getString("a_prenom") + " "
                        + "idBac : " + resultat.getInt("a_idBac" + " ")
                );
            }*/
}
