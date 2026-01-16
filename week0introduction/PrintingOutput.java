/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week0introduction;

import java.util.Scanner;

/**
 *
 * @author aya
 */
public class PrintingOutput {
    public static void main(String[] args) {
        /*
        - Printing in Java
            sending text-based output from a program to an output device,
            usually the screen
        - Printing Methods Provided by Java
            1- print()
            2- println()
        */

        
//        System.out.println("Hello World");
//        System.out.print("Hello from java lab");
//        
        
        
        
        
            // comments
        
        //
        /*
        
        */
        
        
        
        
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1||j==0||j==n-1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
                
            }
            System.out.println("");
        }
        
        
        
        
            
        
        
    }
}
