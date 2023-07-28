/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class JFrameDemo extends JFrame implements ActionListener{
    
    JButton okButton, exitButton, cancelButton;
            
    public JFrameDemo(){
        creatAndShow();
    }
    
    public void creatAndShow(){
        okButton = new JButton("Ok");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");
        
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(okButton);
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);
        okButton.setMnemonic(KeyEvent.VK_O);
        okButton.setToolTipText("Click nut nay de xac nhan");
        
        add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        cancelButton.setMnemonic(KeyEvent.VK_C);
        cancelButton.setToolTipText("Click nut nay de huy thao tac vua chon");
        
        add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
        exitButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setToolTipText("Click vao nut nay de thoat");
        
        setLayout(new FlowLayout());        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JFrameDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(rootPane, "Ban vua nhan nut ok");
        }
        if("cancel".equals(e.getActionCommand())){
            JOptionPane.showConfirmDialog(rootPane, "Ban co muon huy bo khong?");
        }
        if("exit".equals(e.getActionCommand())){
            System.exit(0);
        }
    }
}
