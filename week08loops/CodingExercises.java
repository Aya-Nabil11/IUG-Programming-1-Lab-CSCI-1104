/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week08loops;

import java.util.Scanner;



/**
 *
 * @author aya
 */
public class CodingExercises {
    public static void main(String[] args) {
        /*
        1 - Write a Java program that repeatedly reads a string
        and a character, counts how many times the character appears in the string 
        ,and stops only when the user enters "stop" as the string.
        */
        // Question 1 solution
        Scanner s =new Scanner(System.in);
        while(true){
            System.out.println("Enter A String or \"Stop\" to exit");
            String str = s.nextLine();
            if(str.equalsIgnoreCase("stop"))  break;
            System.out.println("Enter a charachter");
            char ch = s.nextLine().charAt(0);
            int count =0 ;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch)   count++;
            }
            System.out.println("Count: "+count);
        }
         
        /*
        2 - Write a Java program that reads a string and prints all characters that appear more than once.
            input : banana
            output : an
        */
        // Question 2 solution
        System.out.println("Enter a string");
        String str = s.nextLine();//programming
        String repeatedChars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  //p
            for (int j = i+1; j < str.length(); j++) {
                if(!repeatedChars.contains(ch+"") &&ch == str.charAt(j)){
                    repeatedChars+=ch;
                    break;
                }
            }
        }
        System.out.println(repeatedChars);
        
         
        
        
        
        
        /*
        3 - prints all prime numbers between 1 and 100 (inclusive).
        */
        // Question 3 Solution
        for (int i = 2; i <= 100; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0)
                System.out.println(i);           
        }
        
        /*
        4 - Patterns Questions        
        *
        **
        ***
        ****
        *****
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {//*****
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        *****
        *   *
        *   *
        *   *
        *****
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i==0 || i==4 || j ==0 ||j==4){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
        
      
*/
        
        
        
        
        /*
        5 - Menu-Driven Calculator
        Write a Java program that displays the following menu repeatedly using a do-while loop:
        1. Add two numbers
        2. Subtract two numbers
        3. Multiply two numbers
        4. Exit
        */
        
        int choice =0;
        do{
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Exit");
        choice = s.nextInt();
        int num1=0;
        int num2=0;
        int result=0;
        switch (choice) {
            case 1:
                System.out.println("Enter the first number");
                num1=s.nextInt();
                System.out.println("Enter the first number");
                num2=s.nextInt();
                result = num1+num2;
                System.out.println("result: "+result);
                break;
            case 2:
                System.out.println("Enter the first number");
                num1=s.nextInt();
                System.out.println("Enter the first number");
                num2=s.nextInt();
                result = num1-num2;
                System.out.println("result: "+result);
                break;
            case 3:
                System.out.println("Enter the first number");
                num1=s.nextInt();
                System.out.println("Enter the first number");
                num2=s.nextInt();
                result = num1*num2;
                System.out.println("result: "+result);
                break;
            case 4:
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Enter valid number");
        }
        }while(choice!=4);
        
        
     
        
        
        
        
        
    }
}
