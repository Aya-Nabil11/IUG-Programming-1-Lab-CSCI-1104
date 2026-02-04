/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10arrays;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author aya
 */
public class CodingChallenges {
    public static void main(String[] args) {
        // 1- reverse using another array
//        String [] names = {"Ahmed","Doaa","Lana","Sama","Omar"};
//        String [] reversed_names = new String[names.length];
//        
//        for(int i=0;i<names.length;i++){// 0   4
//            reversed_names[i] = names[names.length-1-i];
//        }
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(reversed_names));
        
             
//        2 - reverse in place 
//        String [] names = {"Ahmed","Doaa","Lana","Sama","Omar"};
//        
//        int i = 0;
//        int j=names.length-1;
//        while(i<j){
//            String tmp=names[i];
//            names[i]=names[j];
//            names[j]=tmp;
//            i++;
//            j--;
//
//        }
//        System.out.println(Arrays.toString(names));  
            

//       3 - is Palindrom?

//        Scanner s =new Scanner(System.in);
//        System.out.println("Enter the number of names: ");
//        int num=s.nextInt();
//        s.nextLine();
//        String [] names =new String[num];
//        for(int i=0;i<names.length;i++){
//            System.out.println("Enter "+(i+1)+" name");
//            names[i]=s.nextLine();
//        }
//        System.out.println(Arrays.toString(names));
//        
//        boolean is_palindrom=true;
//        int i=0;
//        int j=names.length-1;
//        while(i<j){
//            if(!names[i].equals(names[j])){
//                is_palindrom=false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        String palindrom = is_palindrom?"Palindrom":"Not Palindrom";
//        System.out.println(palindrom);
        
     // 4 - max and min   
//        int [] nums = {6,5,4,3,25,3,2,42,2};
//        int max = nums[0];
//        int min = nums[0];
//        for(int i = 1 ;i<nums.length;i++){
//            if(nums[i] > max){
//                max=nums[i];
//            }
//            else if(nums[i]<min){
//                min = nums[i];
//            }
//        }
//        System.out.println("Max: "+max);
//        System.out.println("Min: "+min);
     
    // 5 - Missing Element

//    int [] nums= {1,2,3,4,5, 6,7,8};
//    int n = 9;
//    int sum = n*(n+1)/2;
//    int nums_sum=0;
//    for(int i =0;i<nums.length;i++){
//        nums_sum+=nums[i];
//    }
//    int missing_element = sum-nums_sum;
//    System.out.println(missing_element);
    
    // 6 - Find duplicated names and count
    
//    String [] names={"Basem", "Anas" ,"Othman","Sami","Omar","Anas","Basem","Anas","Basem","Anas"};
//    boolean [] is_seen=new boolean[names.length]; // false
//    // [false , false , false , false ,false , true ,true , true]
//    // Basem 2
//    // Anas 3
//    
//    for(int i=0;i<names.length-1 ;i++){
//        int count = 1;          
//        if(!is_seen[i]){
//            
//            for(int j=i+1 ; j<names.length;j++){
//            if(names[i].equals(names[j])){
//                count+=1;
//                is_seen[j]=true;
//            }
//            }
//        }
//        
//        
//        if(count>1){
//            System.out.println(names[i]+" "+count);
//        }
//        
//    } 
        
    
//    // 7 - Left Rotation
//        
//    int [] nums ={1,5,4,3,2,5};
//     // left rotation : 5 , 4 , 3 , 2 , 5, 1
//     // right rotation :  5 , 1 ,5 ,4 ,3 ,2
//     
//     
//    int tmp = nums[0];
//    for(int i=0;i<nums.length-1;i++){
//        nums[i] = nums[i+1];
//
//
//    }
//    nums[nums.length-1] = tmp;
//     
//    
//    System.out.println(Arrays.toString(nums));
     
     
     


















        
            
    
            
        }
} 
        
        
        
        
        
        
        
      
    

