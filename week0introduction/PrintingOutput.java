/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week0introduction;


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
        
        
        
        
        
                int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
}
