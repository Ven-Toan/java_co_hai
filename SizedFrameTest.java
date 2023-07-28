/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodien;

/**
 *
 * @author Admin
 */
import java.awt.*;
import javax.swing.*;

class SimpleFrame extends JFrame {
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public SimpleFrame(){
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
   }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
    }
}
        
public class SizedFrameTest {
    public static void main(String[] args){
      EventQueue.invokeLater(() ->
         {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}
