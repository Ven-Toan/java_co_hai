/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien;



/**
 *  Nguyen Huu Ven Toan
 *  N20DCAT053
 */

import java.awt.*;
import javax.swing.*;

public class ThongTinSinhVien extends JFrame{
    JButton insertButton;
    JLabel HoLabel, TenLabel, MssvLabel, GioiTinhLabel, QueQuanLabel;
    JTextField HoTextField, TenTextField, MssvTextField;
    ButtonGroup GioiTinhGroup;
    JComboBox<String> QueQuanCombo;
    JPanel inputPanel, mainPanel;
    
    public ThongTinSinhVien(){
        unitUI();    
    }
    
    private void unitUI(){
        setSize(400,300);
        setTitle("Thong tin sinh vien");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        
        HoLabel = new JLabel("Ho:");
        HoTextField = new JTextField();
        inputPanel.add(HoLabel);
        inputPanel.add(HoTextField);
        
        TenLabel = new JLabel("Ten:");
        TenTextField = new JTextField();
        inputPanel.add(TenLabel);
        inputPanel.add(TenTextField);
        
        MssvLabel = new JLabel("MSSV:");
        MssvTextField = new JTextField();
        inputPanel.add(MssvLabel);
        inputPanel.add(MssvTextField);
        
        GioiTinhLabel = new JLabel("Gioi tinh:");
        inputPanel.add(GioiTinhLabel);
        GioiTinhGroup = new ButtonGroup();
        addRadioButton("Nam");
        addRadioButton("Nu");
        addRadioButton("Khac");
        
        QueQuanLabel = new JLabel("Que quan:");
        inputPanel.add(QueQuanLabel);
        QueQuanCombo = new JComboBox<>();
        QueQuanCombo.addItem("Long An");
        QueQuanCombo.addItem("Tien Giang");
        QueQuanCombo.addItem("Dong Thap");
        QueQuanCombo.addItem("Ben Tre");
        QueQuanCombo.addItem("Can Tho");
        QueQuanCombo.addItem("Vinh Long");
        QueQuanCombo.addActionListener(event ->{
            
        });
        
        inputPanel.add(QueQuanCombo);
        
        JPanel mainJPanel = new JPanel(new BorderLayout());
        mainJPanel.add(inputPanel,BorderLayout.NORTH);
        add(mainJPanel);
    }
    
    public void addRadioButton (String gioiTinh){
        JRadioButton button = new JRadioButton(gioiTinh);
        GioiTinhGroup.add(button);
        inputPanel.add(button);
    }
    
    public static void main(String[] args) {
        new ThongTinSinhVien().setVisible(true);
    }
}
