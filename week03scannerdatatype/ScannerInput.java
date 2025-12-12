/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week03scannerdatatype;

import java.util.Scanner;

/**
 *
 * @author aya
 */
public class ScannerInput {
    public static void main(String[] args) {
        // Get Started With Scanner
         
//    Scanner s ; // Declare Scanner Type
//    s =new Scanner(System.in);
    
    Scanner s= new Scanner(System.in);
//    1- .next
//    String name=s.next();
//    System.out.println(name);
//      2- .nextLine
//    String name=s.nextLine();
//    System.out.println(name);
//        3- integer
//    int age=s.nextInt();
//    System.out.println("Your Age: "+age);

    
        System.out.println("Enter Your Age : ");
        int age=s.nextInt(); //24
        System.out.println("Enter your name: ");
        s.nextLine(); //enter
        String name=s.nextLine(); // my name
        System.out.println("Your name is :"+name);
        System.out.println("Your age is :"+age);















    }
}
