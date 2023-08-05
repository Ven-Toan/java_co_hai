/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *  Nguyen Huu Ven Toan
 *  N20DCAT053
 */
class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LineSub extends Point{
    private Point end;

    public LineSub(double beginX, double beginY, double endX, double endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    
    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }  

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
    public double getLength(){
        double dx = end.getX() - super.getX();
        double dy = end.getY() - super.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public String toString(){
        return "Line from " + "(" + super.getX() + ", " + super.getY() + ")" + " to " + end.toString();
    }
}
public class OOP_EX9 {
      public static void main(String[] args) {
        Point point1 = new Point(3.5, 4.5);      
        Point point2 = new Point(7.5, 8.5);
        
        LineSub lineSub = new LineSub(point1, point2);
        System.out.println(lineSub);

        System.out.println("Length of the line: " + lineSub.getLength());
    }
}
