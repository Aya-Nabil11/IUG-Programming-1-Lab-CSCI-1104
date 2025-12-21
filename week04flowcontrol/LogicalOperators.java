/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04flowcontrol;

/**
 *
 * @author aya
 */
public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Operator              Name                Example
        &&                    Logical AND         (a > 5) && (b < 10)
        ||                    Logical OR          (a == 5) || (b == 10)
        !                     Logical NOT         !(a > 5)
        */
        // canDrive
        // isValid mark
        
        int age=12;
        boolean hasLicense =true;
        boolean canDrive= age>=18 && hasLicense==true;
        System.out.println(canDrive);
        
        System.out.println("-------------------------------");
        int mark=77;
        boolean isValidMark = mark>=0 && mark<=100;
        System.out.println(isValidMark);
        
        System.out.println("-------------------------");
        boolean isRaining = false;
        boolean hasUmbrella =false;
        
        boolean canGoOut = !isRaining  || hasUmbrella;
        System.out.println(canGoOut);
        
        
        
        
        
        
        
        
        //Short-circuit Evaluation or Lazy Evaluation
        
//        false && ---- ;
//        true || -----
        
        int x =5;
        System.out.println(x==5 || ++x>5);
        System.out.println(x);
        
        
        
        
     }
}
