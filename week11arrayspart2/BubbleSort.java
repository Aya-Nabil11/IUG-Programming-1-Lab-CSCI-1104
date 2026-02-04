/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11arrayspart2;

import java.util.Arrays;

/**
 *
 * @author aya
 */
public class BubbleSort {
    public static void main(String[] args) {

       int [] arr = {15,6,8,6,1};
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=0;j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int tmp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    
                }
            }
            System.out.println("After pass "+(i+1)+"-"+Arrays.toString(arr));
            
            
        }
        
        
        
        
        
        
        
        
    }
}
