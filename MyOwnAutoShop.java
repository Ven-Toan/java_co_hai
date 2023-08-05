/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 * Nguyen Huu Ven Toan N20DCAT053
 */
class Car {

    protected int speed;
    protected double regularPrice;
    protected String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }

    public String toString() {
        return getClass().getName() + "[Speed: " + speed + ", RegularPrice: " + regularPrice + ", Color: " + color + "]";
    }
}

class Truck extends Car {

    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice() * 0.8;
        }
    }

    public String toString() {
        return super.toString() + "[weight: " + weight + "]";
    }

}

class Ford extends Car {

    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }

    public String toString() {
        return super.toString() + "[year: " + year + ", ManufacturerDiscount: " + manufacturerDiscount + "]";
    }

}

public class MyOwnAutoShop {

    public static void main(String[] args) {
        Truck truck = new Truck(90, 12000, "Blue", 2200);

        Ford ford1 = new Ford(100, 15000, "Green", 2020, 2000);
        Ford ford2 = new Ford(110, 14000, "Pink", 2022, 1200);

        System.out.println(truck.toString());
        System.out.println("Truck sale price: " + truck.getSalePrice());
        System.out.println(ford1.toString());
        System.out.println("Ford1 sale price: " + ford1.getSalePrice());
        System.out.println(ford2.toString());
        System.out.println("Ford2 sale price: " + ford2.getSalePrice());
    }
}
