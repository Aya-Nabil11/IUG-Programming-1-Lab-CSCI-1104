/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04flowcontrol;

import java.util.Scanner;

/**
 *
 * @author aya
 */
public class SwitchCase {
    public static void main(String[] args) {
        
         /*
         * SWITCH-CASE STATEMENT
         * 
         * DEFINITION:
         * The switch statement is a control flow statement that allows a variable
         * to be tested for equality against a list of values (cases). Each value
         * is called a case, and the variable is checked for each case.
         * 
         * SYNTAX:
         * switch (expression) {
         *     case value1:
         *         // statements
         *         break;
         *     case value2:
         *         // statements
         *         break;
         *     ...
         *     default:
         *         // statements (optional)
         * }
         * 
         * KEY POINTS:
         * 1. The expression must evaluate to: int, char, String
         * 2. break statement prevents fall-through to next case
         * 3. default case is optional and executes when no case matches
         */

//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter day No.");
//         int dayNo=s.nextInt();
//         String dayName=null;
//        switch (dayNo) {
//            case 1:
//                dayName = "saturday";
//                break;
//            case 2:
//                dayName = "sunday";
//                break;
//            case 3:
//                dayName = "monday";
//                break;
//            case 4:
//                dayName = "Tuesday";
//                break;
//            case 5:
//                dayName = "wednesday";
//                break;
//            case 6:
//                dayName = "thursday";
//                break;
//            case 7:
//                dayName = "friday";
//                break;
//            default:
//                dayName="Invalid day number";
//                break;
//        }
//        
//        System.out.println(dayName);
        
        
        
        
        
        
        
        
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Month number");
        int month=s.nextInt();
        int noOfDays =0;
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12 :
                noOfDays=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                noOfDays=30;
                break;
            case 2:
                noOfDays=28;
                break;
            default:
                System.out.println("invalid month ");
        }
        System.out.println(noOfDays);
        
        
        
        
        
        
        
        
        
    }
}
