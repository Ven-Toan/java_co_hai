/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;

   public Employee(String name, double salary, int year, int month, int day)
   {
      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public String toString()
   {
      return getClass().getName() + "[Name = " + name + ",salary = " + salary + ",hireDay = " + hireDay
            + "]";
   }
}   
class Manager extends Employee
   {
   private double bonus;

   public Manager(String name, double salary, int year, int month, int day, double  bonus)
   {
      super(name, salary, year, month, day);
      this.bonus = bonus;
   }

    public double getBonus() {
        return bonus;
    }
   
   public double getSalary()
   {
      double baseSalary = super.getSalary();
      return baseSalary + bonus;
   }

   public String toString()
   {
      return super.toString() + "[bonus=" + bonus + "]";
   }
}

public class N20DCAT053 {
    public static void main(String[] args) {
        List<Employee> list_staff = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    
        while (true) {
            System.out.println("Nhap 'N' de them nhan vien, 'Q' de them quan ly, 'T' de thoat va in ra danh sach.");
            String choose = sc.nextLine();
            
            if(choose.equalsIgnoreCase("N")){
                System.out.println("Nhap ten nhan vien: ");
                String ten = sc.nextLine();
                System.out.println("Nhap luong: ");
                double luong = sc.nextDouble();
                System.out.println("Nhap nam vao lam: ");
                int nam = sc.nextInt();
                System.out.println("Nhap thang vao lam: ");
                int thang = sc.nextInt();
                System.out.println("Nhap ngay vao lam: ");
                int ngay = sc.nextInt();
                sc.nextLine();
                list_staff.add(new Employee(ten, luong, nam, thang, ngay));
            } else if (choose.equalsIgnoreCase("Q")){
                System.out.println("Nhap ten quan ly: ");
                String ten = sc.nextLine();
                System.out.println("Nhap luong: ");
                double luong = sc.nextDouble();
                System.out.println("Nhap nam vao lam: ");
                int nam = sc.nextInt();
                System.out.println("Nhap thang vao lam: ");
                int thang = sc.nextInt();
                System.out.println("Nhap ngay vao lam: ");
                int ngay = sc.nextInt();
                System.out.println("Nhap luong thuong them: ");
                double thuong = sc.nextDouble();
                sc.nextLine();
                list_staff.add(new Manager(ten, thuong, nam, thang, ngay, luong));
            } else if(choose.equalsIgnoreCase("T")){
                break;
            } else{
                System.out.println("Gia tri khong hop le, vui long nhap lai!");
            }
        }
        System.out.println("In ra danh sach nhan vien va quan li: ");
        for(Employee e : list_staff){
            if(e instanceof Manager){
                Manager m = (Manager) e;
                System.out.println(m.toString());
            } else{
                System.out.println(e.toString());
            }
        }        

    }
    
}
