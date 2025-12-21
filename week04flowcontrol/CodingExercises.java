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
public class CodingExercises {
    public static void main(String[] args) {
        
    // Coding Exercises
    //1- ask the user to enter 3 numbers and print the largest one

//        Scanner s =new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int num1 = s.nextInt();
//        System.out.println("Enter 2nd number");
//        int num2 = s.nextInt();
//        System.out.println("Enter 3rd number");
//        int num3 = s.nextInt();
        
        
        
        /*
        num1 >= num2  and num1 >= num3   ---> num1 is the largest
        num2>=num3                        ---> num2 is the largest
                                         ---> num3 is the largest
        */
//        if(num1>=num2 && num1>=num3){
//            System.out.println(num1+" is the largest");
//        }else if(num2>=num3){
//            System.out.println(num2+" is the largest");
//        }else{
//            System.out.println(num3+" is the largest");
//        }

//****************************************************************************
//    2- Ternary operator(Conditional operator)

//    int x=16;
//    int y=10;
//    int max = x>=y ? x : y;
//    System.out.println(max);
//
//    int x1 = 16;
//    String result = x1%2==0 ? "Even" :"Odd";
//        System.out.println(result);

    
//    ***************************************************************************
    
    //3- check the student gender based on id
    //input : 120200765
    //output : male
    //input : 220200765
    //output : female
    
    
//    Scanner s= new Scanner(System.in);
//    System.out.print("Enter your id: ");
//    String studnet_id=s.nextLine();
//    char firstChar=studnet_id.charAt(0);// '1'
//    switch(firstChar){
//        case '1':
//            System.out.println("male");
//            break;
//        case '2':
//            System.out.println("female");
//            break;
//        default:
//            System.out.println("Invalid Student id");
//            break;
//    }
//*********************************************************************
    // 4- check the leap year
    
//    Scanner s= new Scanner(System.in);
//    System.out.println("Enter a year to check if it is leap or not : ");
//    int year = s.nextInt();
//    boolean isLeap = false;
//    
//    
//    if(year%4==0){
//        if(year%100==0){
//            if(year%400==0){
//                isLeap=true;
//            }
//        }else{
//            isLeap=true;
//        }
//    }
//    
//    if(isLeap){
//        System.out.println(year+" is Leap ");
//    }else{
//        System.out.println(year+" Not Leap ");
//    }    
//  ******************************************************************************  
//    5- Atm Machine 
//    Scanner s= new Scanner(System.in);
//    System.out.println("Enter PIN : ");
//    int storedPin = 1234;
//    double balance = 1000;
//    int pin=s.nextInt();
//    if(pin==storedPin ){
//        System.out.println("Enter 1 to check your balance");
//        System.out.println("Enter 2 to withdraw");
//        System.out.println("Enter 3 to deposite");
//        System.out.println("Enter 4 to exit");
//        int choice =s.nextInt();
//        switch(choice){
//            case 1 :
//                System.out.println("Current Balance "+balance+" $");
//                break;
//            case 2 :
//                System.out.print("Amount: ");
//                double amount = s.nextDouble();
//                if(amount > balance){
//                    System.out.println("Insufficient Funds");
//                    System.out.println("Your balance: $"+balance);
//                    System.out.println("Requested: $"+amount);
//                }else if(amount<=balance && amount >0){
//                    balance-=amount;
//                    System.out.println("Withdrawal Successful");
//                    System.out.println("Amount withdrawn:"+amount);
//                    System.out.println("New balance: $"+balance);
//                }else{
//                    System.out.println("Negative amount");
//                }
//                break;
//            case 3: 
//                System.out.print("Amount: ");
//                double depositedAmount = s.nextDouble();
//                if(depositedAmount>0){
//                    balance+=depositedAmount;
//                    System.out.println("Deposit Successful");
//                    System.out.println("Amount deposited: $"+depositedAmount);
//                    System.out.println("New balance: $"+balance);
//
//                }else{
//                    System.out.println("Negative deposited amount");
//                }
//                break;
//            case 4 :
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
        
  //    }else{
//        System.out.println("Invalid Pin");
//        System.exit(0);
//    }
//    
    
    
    
    
    
    
    
    
    }
}
