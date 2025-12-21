/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04flowcontrol;

/**
 *
 * @author aya
 */
public class PrecedenceRules {
    public static void main(String[] args) {
        /*
        Operators                 
        1- ()
        2- + - ++ -- !    unary operators
        3- * / %   Multiplication, Division, Modulo
        4- + - (addition and subtraction)
        5- < <= > >=
        6- == !=
        7- &&
        8- ||
        */
        
        
//        System.out.println("*** Example 1 ***");
//        int result1 = (2 + 3) * 4; //5*4
//        int result2 = 2 + 3 * 4;  //2+12
//        
//        System.out.println("(2 + 3) * 4 = " + result1);
//        System.out.println("2 + 3 * 4 = " + result2);   

        
        
        
        
        
        
        
//        System.out.println("*** Example 2 ***");
//        System.out.println("5 + 3 > 7: " + (5 + 3 > 7)); // true   
//        System.out.println("10 - 5 < 3: " + (10 - 5 < 3));  //false
//        System.out.println("2 * 3 >= 6: " + (2 * 3 >= 6));   // true
//        
//        System.out.println("*** Example 3 ***");
//        System.out.println("true || false && false: " + (true || false && false));//true
        
//        System.out.println("*** Example 4 ***");
//        int x = 5;
//        int y = 10;
//        int z = 15;
        
//        boolean result3 = x + y > z;
//        System.out.println("x + y > z: " + result3); // false
//        
//        boolean result4 = x * 2 < y + z;  //10 < 25
//        System.out.println("x * 2 < y + z: " + result4); //true
//
//
//        System.out.println("*** Example 5 ***");
//        int p = 10;
//        int q = 5;
//        System.out.println("!(p > q): " + !(p > q)); 
        
        System.out.println("*** Example 6 ***");
        boolean A = true;
        boolean B = false;
        boolean C = true;
        System.out.println("A || B && C: " + (A || B && C)); //true
        System.out.println("(A || B) && C: " + ((A || B) && C)); //true

        
        

    }
}
