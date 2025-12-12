/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02stringdatatype;
/**
 *
 * @author aya
 */
public class StringClassTutorial {
    public static void main(String[] args) {
        /*
         * The String class in Java is used to create and manipulate text.
         * Strings are objects, not primitive data types.
         */    
        // -------------------------------------------------------------
        // 1. Declaring and Initializing Strings
        // 2. Warning(Yellow)  vs Error(red)
        // 3. StringIndexOutOfBoundException
        // -------------------------------------------------------------        
        
        /*
        *  1- ' → single quote
        *  2- " → double quote
        *  3- ( → parenthesis
        *  4- { → curly bracket 
        *  5- [ → square bracket
        */
        
      /* 
       *Data Types 
       * 1- primitive Data Types  ->value
       * 2- Non-primitive data types(class, reference)-->address
      */ 
      
//    String name;  // declaration
//    name="Aya";   //initilization
//    System.out.println("name: " + name); // cocatenation
//    System.out.println("name"+1+2);  // name1+2 =name12
//    System.out.println(1+2+"name");  //1+2 =3+"name" =3name
        
        
//    Basic Example
//    String name="Aya";
//    String city="Gaza";
//    String message=name+" lives in "+city;
//    System.out.println(message);





//    String firstName = "Ahmed";
//    String lastName = "Ali";
//    String fullName = firstName + " " + lastName;
//    System.out.println(firstName);
//    System.out.println(lastName);
//    System.out.println(fullName);



    // Primitives
    int x = 10;
    int y = x; // Copies the VALUE
    y = 20; // x is still 10
//    System.out.println(x);
//    System.out.println(y);
    // Strings
    String s1 = "Hello";
    String s2 = s1; // Copies the REFERENCE (address)
    s2 = "World"; // Creates new object, s1 unchanged



    //  x -> 10
    //  y -> 20

    // s1 -> 0x1A11      0x1A11 ->"Hello"
    // s2 -> 0x1A12      0x1A12 ->"world"

    // immutable can't be change
    // length
    String message="Aya Nabil";// 0-4
    int length = message.length();
    System.out.println("length\t"+length);
    //toLowerCase  and toUpperCase
    String smallLetter=message.toLowerCase();
    String capitalLetter=message.toUpperCase();
    System.out.println("Lower case\t"+smallLetter);
    System.out.println("Upper case\t"+capitalLetter);
    // index of the last char= length -1 -> 5-1
//    int indexOfLastChar=length-1;
//    char c=message.charAt(indexOfLastChar);
//    System.out.println(c);
    // Substring
//    String substringMessage= message.substring(4);
//    String substringMessage2= message.substring(1,4);
//    System.out.println("substringMessage:"+substringMessage);
//    System.out.println("substringMessage:"+substringMessage2);
//    System.out.println(indexOfLastChar);
    // concat
//    String concatedMessage=message.concat(" Saleem Alharazin");
//    System.out.println(concatedMessage);
//    int index=message.indexOf(" ");
//    System.out.println("index of a "+index);
    // equals
//    String password1="Aya123";
//    String password2="aya123";
//    boolean isEqual=password1.equals(password2);
//    System.out.println(isEqual);
    
    // equalsIgnoreCase
//    String password3="Aya123";
//    String password4="aya123";
//    boolean isEqual1=password3.equalsIgnoreCase(password4);
//    System.out.println(isEqual1);
    // compareTo
//    String name1="khalid";
//    String name2="ahmed";
//    int compareTo=name1.compareTo(name2);
//    System.out.println(compareTo);
    // isEmpty and isBlank
//    String s="       ";
//    System.out.println(s.isEmpty());
//    System.out.println(s.isBlank()); // return true if the String empty or contail whitspaces
    // contains
//    String names="ahmed , khalid , sami";
//    System.out.println(names.contains("ali"));  // true
    // replace
//    String message1 ="Hi from python lab , puthon is fun!";
//    String replacedMessage=message1.replace("python", "java");
//    System.out.println(replacedMessage);
    // trim 
//    String message2="    hello world  ";
//    String trimmedMessage=message2.trim();
//        System.out.println(trimmedMessage);
    }
}
