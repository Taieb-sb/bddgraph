import Model.CandidatRepository;
import Model.Connexion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Contact extends JFrame {
    private JPanel contact;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JRadioButton hommeRadioButton;
    private JRadioButton femmeRadioButton;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton resetButton;
    private JButton quitterButton;
    private JButton validerButton;
    private JTextArea textArea1;

    public Contact() {

        Connexion connexion = null;
        setTitle("Connexion");
        setSize(900, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(contact);
        setLocationRelativeTo(null);

        validerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().add(contact);
                CandidatRepository Etu = new CandidatRepository();
                Etu.ajtEtudiant(connexion);
                System.out.println("Données ajoutées avec succès !");
                quitterButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        });

    }
}
