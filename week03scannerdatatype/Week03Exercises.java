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
public class Week03Exercises {
    public static void main(String[] args) {
      
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter a String");
//        String message=s.nextLine();
//        // compute the length
//        int length=message.length();
//        System.out.println("Length:\t"+length+" characters");
//        // Compute To Uppercase
//        String toUpperCase=message.toUpperCase();
//        // Uppercase: "AYA NABIL"
//        System.out.println("Uppercase:\t\""+toUpperCase+"\"");
//        // Compute To LowerCase
//        String toLowerCase=message.toLowerCase();
//        System.out.println("LowerCase:\t\""+toLowerCase+"\"");   
//        //Compute First char
//        // First Character: 'A'
//        char firstChar=message.charAt(0);
//        System.out.println("First Character:\t'"+firstChar+"'");
//        // Last Character: 'A'
//        char lastChar=message.charAt(message.length()-1);
//        System.out.println("Last Character:\t'"+lastChar+"'");
//        


    Scanner s=new Scanner(System.in);
    System.out.println("Enter Full Name:");
    String fullName=s.nextLine();
//     Title case
    int spaceIndex=fullName.indexOf(" ");
    String firstName=  fullName.substring(0,spaceIndex); //0-2
    String secondName= fullName.substring(spaceIndex+1);
    char firstCharOfFirstName=firstName.toUpperCase().charAt(0);
    char firstCharOfSecondtName=secondName.toUpperCase().charAt(0);
//    System.out.println(firstCharOfFirstName);
//    System.out.println(firstCharOfSecondtName);
       // A                  //hmed
    String firstNameWithTitleCase=firstCharOfFirstName+firstName.substring(1);
    String secondNameWithTitleCase=firstCharOfSecondtName+secondName.substring(1);
    String titleCaseFullName=firstNameWithTitleCase+" "+secondNameWithTitleCase;
    System.out.println("Title Case:\t\""+titleCaseFullName+"\"");
    // Title Case: "Ahmed Ali"
    // Word count
//    aya nabil saleem alharazin
// noOfWords=noOfSpaces+1
//          =3+1


    int length=fullName.length();
    int lengthOfNoSpacesFullName=fullName.replace(" ","").length();
    int noOfSpace=length-lengthOfNoSpacesFullName;
    System.out.println("Number of words= "+(noOfSpace+1));




    
    
    
    
    
    
    
    }
}
