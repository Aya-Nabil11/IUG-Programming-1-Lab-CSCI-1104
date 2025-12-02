/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_stringAndScanner;

import java.util.Scanner;

/**
 *
 * @author aya
 */
public class Week02Exercises {
    public static void main(String[] args) {
       //    \n
       //   \t
       // print " " 
       Scanner s=new Scanner(System.in);
        System.out.println("Enter a number of 4 digits: ");
       int num=s.nextInt();
       // 1998
        System.out.println(num/1000);
        num%=1000;
        System.out.println(num/100);
        num%=100;
        System.out.println(num/10);
        num%=10;
        System.out.println(num);
        
       
       
       
    }
}
