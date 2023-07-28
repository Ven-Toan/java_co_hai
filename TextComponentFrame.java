/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien;

/**
 * Nguyen Huu Ven Toan
 * N20DCAT053
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextMeasurer;
import javax.swing.*;

public class TextComponentFrame extends JFrame{
    private TextArea txtArea;
    private JTextField tfUserName;
    private JPasswordField tfPassWord;
            
    public TextComponentFrame(){
        JButton btn1 = new JButton("Insert");
        
        JLabel lbl1 = new JLabel("Username:");
        JLabel lbl2 = new JLabel("Password");
        
        tfUserName = new JTextField();
        tfPassWord = new JPasswordField();
        
        txtArea = new TextArea(8,20);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        
        JPanel southPanel = new JPanel();
        southPanel.add(btn1);
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(lbl1);
        northPanel.add(tfUserName);
        northPanel.add(lbl2);
        northPanel.add(tfPassWord);
        
        add(southPanel,BorderLayout.SOUTH);
        add(northPanel,BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        pack();
            
        btn1.addActionListener((e) -> {
            txtArea.append("User name: " + tfUserName.getText()+"\n");
            txtArea.append("Password: " + new String(tfPassWord.getPassword())+"\n");
            tfUserName.setText("");
            tfPassWord.setText("");
        });
        
        BtnAction btnAction1 = new BtnAction();
        btn1.addActionListener(btnAction1);
        
    }
        private class BtnAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            txtArea.append("User name: " + tfUserName.getText()+"\n");
            txtArea.append("Password: " + new String(tfPassWord.getPassword())+"\n");
        }
    }   
    public static void main(String[] args) {
        TextComponentFrame frame = new TextComponentFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
    }
}