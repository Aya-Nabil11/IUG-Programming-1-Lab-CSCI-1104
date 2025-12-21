/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week04flowcontrol;

/**
 *
 * @author aya
 */
public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Operator      Name                    Example
        ==            Equal to                a == b
        !=            Not equal to            a != b
        >             Greater than            a > b
        <             Less than               a < b
        >=            Greater than or equal   a >= b
        <=            Less than or equal      a <= b
        
        ** the difference between == and equals()
        */
           
//        int a =10;
//        int b=20;
//        int c=10;
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a != c);
//        System.out.println(a >= c);
//        System.out.println(b <= c);
        
//        String name1="Hello";
//        String name2=new String("Hello");
//        String name3 =name2;
//        System.out.println(name1 == name2); // false
//        System.out.println(name2==name3); // true
//        System.out.println(name1.equals(name2));//true
        // name1    01110             01110    "Hello"
        // name2    11011             11011    "Hello"
        // name3    11011
        
        
        
        
        
        String s1 = "Hello";           
        String s2 = "Hello";           
        String s3 = new String("Hello"); 
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        
        // s1 --> 0111        0111 --> "Hello"
        // s2 --> 0111
        // s3 --> 0101        0101 --> "Hello"

        
        
        
    }
}
