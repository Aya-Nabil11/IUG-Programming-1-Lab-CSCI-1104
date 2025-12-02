/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week01variables;

/**
 *
 * @author aya
 */
public class JavaDataTypes {
    public static void main(String[] args) {
        /*
        - Java is a statically typed programming language,
          meaning variable types are known at compile time.
        - Data types in Java divided into two categories: 
            1- Primitive Data Types: Store simple values directly in memory.(value)
            2- Non-Primitive (Reference) Data Types: Store memory references to objects.(address)
        - Primitive Data Types :
            1- boolean
            2- byte  
            3- short
            4- int
            5- long
            6- float
            7- double
            8- char
        */
  //String name ="Aya";
  //double price =14.5;
  
  boolean isGraduated=true;
  System.out.println("is Aya Graduated "+isGraduated);
  
  int age=22;
  System.out.println("the Age of Aya: "+age);
  
  double price=15.5;
  System.out.println("the price of tea: "+price);
  
  char c='r';
  System.out.println(c);
        
  String name="Aya";
  String college="CS";
  System.out.println("the student name "+name +" and her college "+college);
        
    }
}
