/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10arrays_part01;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author aya
 */
public class OverView {
    public static void main(String[] args) {
       /*
        * Arrays = Collection of values of the same data type
        * think of it like a variable that can store more than one value
        */ 
       
//       Scanner s = new Scanner(System.in);
//       int [] grades = new int[5];
//       for(int i = 0;i<grades.length;i++){
//           grades[i] = s.nextInt();
//       }
//       
//       for(int i = 0;i<grades.length;i++){
//           grades[i]+=5;
//       }
//        System.out.println("------------------------------------");
//       for(int i = 0;i<grades.length;i++){
//           System.out.println(grades[i]);
//       }
       
/************ Declaration & Initialization *************/

    String [] names = new String [5]; //Object
    
    System.out.println(names.length);
    names[0] = "Aya";
    names[1] ="lana";
    names[2] ="sama";
    names[3] ="sana";
    names[names.length-1] ="soha";
    
    int [] nums ={1,2,3,4,3,2,1};

    for(int i =0;i<names.length;i++){
        System.out.println(names[i]);
    }
    
        System.out.println(Arrays.toString(nums));




























 
       
    }
}

        
        
             
        
    

