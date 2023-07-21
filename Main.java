/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputNumber = input.split(" ");
        for(String numStr : inputNumber){
            int num = Integer.parseInt(numStr);
            numbers.add(num);
        }
        numbers.replaceAll(n -> n*2);
        for(int n : numbers){
            System.out.print(n + " ");
        }
    }
    
}
