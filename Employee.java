/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Admin
 */

import java.time.*;
import java.util.LinkedList;

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

   @Override
   public String toString()
   {
      return getClass().getName() + "[Name = " + name + ",salary = " + salary + ",hireDay = " + hireDay
            + "]";
   }
   
   public class Manager extends Employee
   {
   private double bonus;

   public Manager(String name, double salary, int year, int month, int day)
   {
      super(name, salary, year, month, day);
      bonus = 0;
   }

   @Override
   public double getSalary()
   {
      double baseSalary = super.getSalary();
      return baseSalary + bonus;
   }

   public void setBonus(double bonus)
   {
      this.bonus = bonus;
   }

   @Override
   public String toString()
   {
      return super.toString() + "[bonus=" + bonus + "]";
   }
    }
   
    public static void main(String[] args) {
        LinkedList<Employee> el = new LinkedList<>();
        Employee e1 = new Employee("Toan", 12000, 2020, 12, 12);
        Employee e2 = new Employee("Tan", 11000, 2020, 2, 2);
        Employee e3 = new Employee("Tuan", 8000, 2020, 1, 1);
        Employee e4 = new Employee("Tu", 9000, 2020, 3, 12);
        Employee e5 = new Employee("Huy", 7000, 2020, 7, 12);
        Employee e6 = new Employee("Khoi", 15000, 2020, 12, 25);
        Employee e7 = new Employee("Nhan", 1000, 2020,7, 8);
        Employee e8 = new Employee("Ngan", 5000, 2020,8, 4);
        el.add(e1);
        el.add(e2); 
        el.add(e3);
        el.add(e4);
        el.add(e5);
        el.add(e6);
        System.out.println("Danh sach ban dau: ");
        for(Employee e : el){
            System.out.println(e);
        }
        el.remove(2);
        System.out.println("Danh sach sau khi xoa nhan vien thu 3: ");
        for(Employee e : el){
            System.out.println(e);
        }
        el.add(1,e7);
        el.add(4,e8);
        System.out.println("Danh sach sau khi them nhan vien o vi tri 1 va 4: ");
        for(Employee e : el){
            System.out.println(e);
        }
    }       
}
