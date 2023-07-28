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
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MenuTest extends JFrame{
    public MenuTest(){
        unitUI();
    }
    private void unitUI(){
        setTitle("MenuTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.addSeparator();
        
        JMenu optionsMenu = new JMenu("Options");
        JCheckBoxMenuItem readonlyItem = new JCheckBoxMenuItem("Read-Only");
        optionsMenu.add(readonlyItem);
        optionsMenu.addSeparator();
        
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
        insertItem.setSelected(true);
        JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");
        group.add(insertItem);
        group.add(overtypeItem);
        
        optionsMenu.add(insertItem);
        optionsMenu.add(overtypeItem);
        editMenu.add(optionsMenu);
        
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        
    }
    public static void main(String[] args) {
        new MenuTest().setVisible(true);
    }
}
