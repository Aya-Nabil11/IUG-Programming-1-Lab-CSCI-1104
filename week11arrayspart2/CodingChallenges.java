/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11arrayspart2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aya
 */
public class CodingChallenges {

    public static void main(String[] args) {
        
        // 1- Two Sum
//        String nums = "2,7,11,15";
//        int target =11;
//        String [] string_arr = nums.split(",");
//        int [] int_arr = new int[string_arr.length];
//        for(int i=0;i<int_arr.length;i++){
//            int_arr[i] = Integer.parseInt(string_arr[i]);
//        }
//
//        System.out.println(Arrays.toString(int_arr));
//        
//        for(int i=0;i<int_arr.length-1;i++){
//            for(int j=i+1 ;j<int_arr.length;j++){
//                if(int_arr[i]+int_arr[j]==target){
//                    System.out.println("("+i+","+j+")");
//                    break;
//                }
//                
//            }
//            
//        }
        
        
    // 2 - Find the Equilibrium Element 
        
        
//    int[] arr = {7, 5, 3, 4, 8};
//    String values = "7 1 0 4 8";
    // left = 12
    // sum = 27
    // current = 3
    // right = sum - (left +current)
    
        
//    String [] string_arr = values.split(" ");
//    int [] int_arr=new int[string_arr.length];
//    for(int i=0;i<string_arr.length;i++){
//        int_arr[i] = Integer.parseInt(string_arr[i]);
//    }
//    
//    System.out.println(Arrays.toString(int_arr));
//    
//    int left = 0;
//    int sum=0;
//    int current;
//    int right;
//    
//    for(int num:int_arr){
//        sum+=num;
//    }
    
    
//    for(int i=0;i<int_arr.length;i++){
//        current=int_arr[i];
//        right = sum - (left+current);
//        if(left == right){
//            System.out.println(i +" - "+int_arr[i]);
//            break;
//        }else{
//            left+=current;
//        }
//    }
      
      // 2D Array
      
      
//      int [][] arr=new int[2][3];
      /*
      45  100  40
      90  88  11
      */
      
//      arr[0][0] = 45;
//      arr[1][2] = 11;
//      arr[1][1] =88;
//      arr[0][1]=100;
//      arr[1][0] =90;
//      arr[0][2]=40;
      
//        System.out.println(arr.length); // Number of rows
//        System.out.println(arr[0].length); // Number of column in the first row
//        System.out.println(arr[1].length); // Number of column in the first row
      
//    Scanner s=new Scanner(System.in);
//    for(int i=0;i<arr.length;i++){
//        for(int j=0;j<arr[i].length;j++){
//            System.out.println("Enter in "+i+j+" index");
//            arr[i][j] = s.nextInt();
//        }
//    }
      
//      for(int i=0;i<arr.length;i++){
//          for(int j=0;j<arr[i].length;j++){
//              System.out.print(arr[i][j] +" ");
//          }
//          System.out.println("");
//          
//      }
      
        
     int [][] arr = {
         {1,2,3},
         {4,5,6}
           };
     int [] sumOfEachRow = new int[arr.length];
     int [] sumOfEachColumn = new int[arr[0].length];
        
    // {6 , 15}
    // {5 , 7 , 9}
        
    // Sum of Each Row
//        for(int i=0;i<arr.length;i++){
//          int sum=0;
//          for(int j=0;j<arr[i].length;j++){
//              sum+=arr[i][j];
//          }
//          sumOfEachRow[i]=sum;
//        } 
        
        
//        for(int num:sumOfEachRow){
//            System.out.println(num);
//        }
        
        
        
   // Sum Of each Column 
   
        
        
        for(int i = 0;i<arr[0].length ;i++){
            int col_sum = 0;
            for(int j=0;j<arr.length;j++){
                col_sum+=arr[j][i];
            }
            sumOfEachColumn[i]=col_sum;
        }
        
        
        for(int num:sumOfEachColumn){
            System.out.println(num);
        }






   
   
   
   
   
   
   
   








 
        
        
     
        
    }
}
