import Model.UserRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.sql.SQLException;

class Cadre extends JFrame {

    private JTextField textField2;
    private JPasswordField passwordField1;
    private JButton confirmeButton;
    private JButton annuelButton;
    private JPanel Auth;


    //connexion, password
    public Cadre() {

        setTitle("Connexion");
        setSize(550, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(Auth);
        setLocationRelativeTo(null);

        confirmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Appuis");
                UserRepository user = new UserRepository();
                String login = textField2.getText();
                System.out.println(login);
                String password = String.valueOf(passwordField1.getPassword());
                System.out.println(password);
                try{

                    if(user.CheckLogin(login, password)==1){
                        Contact c1 = new Contact();
                        c1.setVisible(true);

                    }
                }catch (SQLException event){
                    System.out.println(event.getMessage());
                }
                annuelButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){System.exit(0);}
                });
            }
        });
    }
}
