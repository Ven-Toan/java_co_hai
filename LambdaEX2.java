/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LambdaEX2 {
    private static int calSumOfNum(int num){
        int sum = 0;
        while(num !=0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputNumber = input.split(" ");
        for (String numStr : inputNumber){
            int num = Integer.parseInt(numStr);
            numbers.add(num);
        }
        Collections.sort(numbers, (a,b)->{
            int sumA = calSumOfNum(a);
            int sumB = calSumOfNum(b);
            
            if (sumA == sumB){
                return Integer.compare(a, b);
            } else {
                return Integer.compare(sumA, sumB);
            }
        });
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
    
