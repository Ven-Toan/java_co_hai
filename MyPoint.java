/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ven Toan
 * @version 2.0
 * @param role: luu thong tin cua mot diem
 */
public class MyPoint {

    private double x;
    private double y;

    /**
     *
     * @param x la gia tri toa do x cua diem
     * @param y la gia tri toa do y cua diem
     */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param x
     * @return gia tri toa do x
     */
    public double getX() {
        return x;
    }

    /**
     * @param y
     * @return gia tri cua toa do y
     */
    public double getY() {
        return y;
    }

    /**
     * @deprecated distance
     * @return tinh khoang cach giua 2 diem
     */
    public double distance(MyPoint p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Nhap toa do y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Nhap toa do x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Nhap toa do y2: ");
        double y2 = sc.nextDouble();

        MyPoint point1 = new MyPoint(x1, y1);
        MyPoint point2 = new MyPoint(x2, y2);

        System.out.println("Diem 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Diem 2: (" + point2.getX() + ", " + point2.getY() + ")");

        double distance = point1.distance(point2);
        System.out.println("Khoang cach giua 2 diem: " + distance);
    }

}
