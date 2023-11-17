package view;

import controller.usercontroller;
import model.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginMenu extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private UserController userController;

    public LoginMenu() {
        usercontroller = new usercontroller();

        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createLoginMenu();
    }

    private void createLoginMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        panel.add(loginButton);

        add(panel);
    }

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        User user = userController.loginUser(email, password);

        if (user != null) {
            GameListMenu gameListMenu = new GameListMenu(user);
            gameListMenu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginMenu().setVisible(true);
            }
        });
    }
}
