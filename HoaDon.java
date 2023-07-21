/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String so;
    private String moTa;
    private int soLuong;
    private double gia;

    public HoaDon(String so, String moTa, int soLuong, double gia) {
        this.so = so;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    
    public void setSo(String so){
        this.so = so;
    }
    
    public String getSo(){
        return so;
    }
    
    public void setMoTa(String moTa){
        this.moTa = moTa;
    }
    
    public String getMoTa(){
        return moTa;
    }
    
    public void setSoLuong(int soLuong){
        if(soLuong > 0){
            this.soLuong = soLuong;
        } else{
            this.soLuong = 0;
        }
    }
    
    public int getSoLuong(){
        return soLuong;
    }
    
    public void setGia(double gia){
        if(gia > 0){
            this.gia = gia;
        } else{
            this.gia = 0.0;
        }  
    }
    
    public double getGia(){
        return gia;
    }
    
    public double getInvoice(){
        return soLuong * gia;
    } 
}

class InVoiceTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Thong tin don hang-----");
        System.out.print("Nhap so hoa don: ");
        String so = sc.nextLine();
        System.out.print("Nhap mo ta hoa don: ");
        String moTa = sc.nextLine();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        System.out.print("Nhap gia moi mat hang: ");
        double gia = sc.nextDouble();
        HoaDon invoice = new HoaDon(so, moTa, soLuong, gia);
        
        System.out.println("-----Thong tin don hang-----");
        System.out.println("So hoa don: " + invoice.getSo());
        System.out.println("Mo ta hoa don: " + invoice.getMoTa());
        System.out.println("So luong: " + invoice.getSoLuong());
        System.out.println("Gia moi mat hang: " + invoice.getGia());
        System.out.println("So tien trong hoa don: " + invoice.getInvoice());
    }
}