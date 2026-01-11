/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week07loops;

import java.util.Scanner;

/**
 *
 * @author aya
 */
public class CodingExercises {
    public static void main(String[] args) {
    // Coding exercises using loops
    // 1- calculate the sum of all even numbers from 1 to 10
    /*
    int sum = 0;
    for(int i=1;i<=10;i++){
        if(i%2==0){
           sum+=i; 
        }
    }
        System.out.println("Sum: "+sum);
    */
    
    
    
    // 2- asks the user to enter an integer number and then calculates and prints the sum of its digits.‎
/*
    int num=123456;
    // 1+2+3+4+5 = 15
    int sum = 0;
    while(num>0){
        int lastDigit = num%10;
        sum+=lastDigit;
        num =num/10;
    }
    System.out.println("Sum: "+sum);
*/

    // 3- Write a program that reads an integer number and prints true 
    //    if the number is a palindrome; otherwise, it prints false.
    // 12321   =====> 12321
    /*
    int num =11321;
    int rev = 0;
    int tmp =num;
    
    while(num>0){
        int lastDigit = num%10;
        rev = (rev*10) +lastDigit;
        num = num/10;
    }
    
        System.out.println(tmp==rev);
    
*/
    // 4- Write a program to compute and print the n-th Fibonacci number.
    
//    int n =6;
//    int a = 0;
//    int b= 1;
//    for(int i =2 ; i<=n ;i++){
//        int c = a+b;  // c =8
//        a=b; // a =5
//        b=c; //b=8
//    }
//        System.out.println(b);
    
    
    // 5- Write a program that converts a decimal number to its binary representation.
    
/*
    int n =30; // 1010
    String result ="";
    
    while(n>0){
        int reminder = n%2; //0101
        result = reminder+result;
        n =n/2;
    }
        System.out.println(result);
    
 */  
    /*
    6 -
    Write a program that keeps asking the user to enter integer numbers.
    The user will stop entering numbers when they enter -1.
    When the user enters -1, the program should display:
    the largest number
    the second largest number
    */    
    
//    int largest = Integer.MIN_VALUE;
//    int second = Integer.MIN_VALUE;
//    
//    while(true){
//        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
//        if(num == -1)   break;
//        if(num>=largest){
//            second=largest;
//            largest=num;
//        }else if(num>second){
//            second = num;
//        }
//    }
//    
//        System.out.println("Largest: "+largest);
//        System.out.println("second largest: "+second);
        
        
//        for (int i =1;i<=10;i++){
//            if (i%3==0)   continue;
//            System.out.println(i);
//        }





    
    
    
    
    
    
    
    
    
    

    }
}
