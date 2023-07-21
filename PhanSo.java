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


public class PhanSo {
    private int tuSo;
    private int mauSo;
    
    public PhanSo(){
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public PhanSo(int ts, int ms){
        if(ms==0){
            throw new IllegalArgumentException("Mau so khong the bang 0!");
        }
        this.tuSo = ts;
        this.mauSo = ms;
    }
    
    public int getTuSo(){
        return tuSo;
    }
    
    public int getMauSo(){
        return mauSo;
    }
    
    private int timUCLN(int a, int b){
        if(b==0){
            return a;
        }
        return timUCLN(b,a%b);   
    }
    
    private PhanSo rutGon(PhanSo ps){
        int ucln = timUCLN(ps.tuSo, ps.mauSo);
        return new PhanSo(ps.tuSo/ucln, ps.mauSo/ucln);
    }
    
    public PhanSo cong(PhanSo ps){
        int tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return rutGon(new PhanSo(tuSoMoi,mauSoMoi));
    }
    
    public PhanSo tru(PhanSo ps){
        int tuSoMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return rutGon(new PhanSo(tuSoMoi,mauSoMoi));
    }
    
    public PhanSo nhan(PhanSo ps){
        int tuSoMoi = this.tuSo * ps.tuSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return rutGon(new PhanSo(tuSoMoi,mauSoMoi));
    }
    
    public PhanSo chia(PhanSo ps){
        int tuSoMoi = this.tuSo * ps.mauSo;
        int mauSoMoi = this.mauSo * ps.tuSo;
        return rutGon(new PhanSo(tuSoMoi,mauSoMoi));
    }
    
    public String toString(){
        return tuSo + "/" + mauSo;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so 1: ");
        int ts1 = sc.nextInt();
        System.out.println("Nhap mau so 1: ");
        int ms1 = sc.nextInt();
        System.out.println("Nhap tu so 2: ");
        int ts2 = sc.nextInt();
        System.out.println("Nhap mau so 2: ");
        int ms2 = sc.nextInt();
        
        PhanSo ps1 = new PhanSo(ts1,ms1);
        PhanSo ps2 = new PhanSo(ts2,ms2);
        
        System.out.println("Phan so 1: " + ps1.toString());
        System.out.println("Phan so 2: " + ps2.toString());
        
        PhanSo tong = ps1.cong(ps2);
        System.out.println("Tong 2 phan so la: " + tong.toString());
        
        PhanSo hieu = ps1.tru(ps2);
        System.out.println("Hieu 2 phan so la: " + hieu.toString());
        
        PhanSo tich = ps1.nhan(ps2);
        System.out.println("Tich 2 phan so la: " + tich.toString());
        
        PhanSo thuong = ps1.chia(ps2);
        System.out.println("Thuong 2 phan so la: " + thuong.toString());
        
        sc.close();
    }       
}
