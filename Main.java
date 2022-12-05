import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(null);

        frame.setSize(500, 300);
        frame.setTitle("Website");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        JLabel email = new JLabel("Enter email");
        email.setBounds(10, 30, 80, 20);
        panel.add(email);

        JLabel password = new JLabel("Enter password: ");
        password.setBounds(10, 60, 80, 20);
        panel.add(password);


        JTextField emailField = new JTextField();
        emailField.setBounds(90, 30, 140, 20);
        panel.add(emailField);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(90, 60, 140, 20);
        panel.add(passwordField);



        JButton button = new JButton("Register");
        button.setBounds(230, 90, 140, 20);
        panel.add(button);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = e.getActionCommand();


                JLabel display = new JLabel();
                display.setBounds(170, 130, 90, 20);
                panel.add(display);
                display.setText("Well done!");


            }
        });


        frame.setVisible(true);
    }
}