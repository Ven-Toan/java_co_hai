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

class Line {

    private Point begin;
    private Point end;

    public Line(double beginX, double beginY, double endX, double endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
    public double getLength(){
        double dx = end.getX() - begin.getX();
        double dy = end.getY() - begin.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public String toString(){
        return "Line from " + begin.toString() + " to " + end.toString();
    }
}

public class OOP_EX10 {
    public static void main(String[] args) {
        Point point1 = new Point(3.5, 4.6);
        System.out.println("Point 1: " + point1);
        
        Point point2 = new Point(7.4, 8.5);
        System.out.println("Point 2: " + point2);
        
        Line line = new Line(point1, point2);
        System.out.println(line);

        System.out.println("Length of the line: " + line.getLength());
    }
}
