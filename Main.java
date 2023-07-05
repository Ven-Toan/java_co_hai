package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void luuFile(double dienTich, double chuVi) {
        try {
            FileWriter ghiFile = new FileWriter("MaSV.txt");
            PrintWriter inFile = new PrintWriter(ghiFile);
            
            inFile.println("Dien tich hinh chu nhat la: " + dienTich);
            inFile.println("Chu vi hinh chu nhat la: " + chuVi);
            
            inFile.close();
        } catch (IOException e){
            System.out.println("Da co loi xay ra!");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap chieu dai tu ban phim: ");
        double chieuDai = sc.nextDouble();
        
        System.out.println("Nhap chieu rong tu ban phim: ");
        double chieuRong = sc.nextDouble();
        
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich hinh chu nhat la: "+ dienTich);
        
        luuFile(dienTich, chuVi);
        System.out.println("Du lieu da duoc luu vao file.");
        
        sc.close();
    }
}
