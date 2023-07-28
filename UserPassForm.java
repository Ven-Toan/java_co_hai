/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien;

/**
 * Nguyen Huu Ven Toan
 * N20DCAT053
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPassForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextArea textArea;

    public UserPassForm() {
        initUI();
    }

    private void initUI() {
        setTitle("Username and Password Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Panel to hold the input components
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 5, 5));

        // Username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        // Button to insert the data into the textarea
        JButton insertButton = new JButton("Insert");
        insertButton.addActionListener(event ->
        {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (!username.isEmpty() && !password.isEmpty()) {
            // Append the data to the text area
            textArea.append("Username: " + username + "\t");
            textArea.append("Password: " + password + "\n");

            // Clear the input fields after insertion
            usernameField.setText("");
            passwordField.setText("");
        }
        });

        // Text area to display the inserted data
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Main panel to hold all the components
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(insertButton, BorderLayout.SOUTH);
        add(mainPanel);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserPassForm().setVisible(true);
            }
        });
    }
}
