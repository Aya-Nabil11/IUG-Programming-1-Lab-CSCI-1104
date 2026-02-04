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
public class SelectionSort {
    public static void main(String[] args) {
        
        int [] arr = {15,6,8,6,1};
        for(int i=0;i<arr.length-1 ;i++){
            // Search for min value
            int minIndex = i;//1
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[j] <arr[minIndex]){
                    minIndex=j; //1
                }
            }
            System.out.println("");
            int tmp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=tmp;
            System.out.println("After pass "+(i+1)+"-"+Arrays.toString(arr));
            
            
        }
        
        
        
        
        
        
        
        
    }
}
