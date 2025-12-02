/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02stringandscanner;


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
        // -------------------------------------------------------------        
        String firstName = "Aya";
        String lastName = "Alharazin";
        // Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        // What the output of this program
        System.out.println("Hi from "+5+1+" class");
        System.out.println("Hi from"+(5+1)+" class");
        System.out.println(5+1+"Hi from"+" class");
        String x="aya";
        String x2="aya";
        System.out.println(x==x2);
        
        
       
        
        
        
        
        String name="Aya";
        String name2=name;
        name2="salma";
        System.out.println(name2);
        System.out.println(name);
        
        
        /*
      
┌──────┐               
│  x   |───────────┐   
└──────┘           │   ┌─────────┐
                   └───>│  "aya"│
┌──────┐           ┌───>│        │
│  x2  │───────────┘   └─────────┘
└──────┘
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // -------------------------------------------------------------
        // 2. Useful String Methods
        // -------------------------------------------------------------
        
        // 1. int length() Method
        
        
        // 2.String toLowerCase() Method
        // 3.String toUpperCase() Method
        // 4. charAt(int i) Method
        // 5. String substring(int i) Method
        // 6. String concat( String s) Method
        // 7 int indexOf(String s) Method
        // 8. boolean equals(String s) Method
        // 9. boolean equalsIgnoreCase(String s) Method
        // 10. int compareTo(String s) Method
        // 11.String trim() Method
        // 12. boolean contains(String sequence) Method
        // 13.boolean startsWith(String s) Method


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
    // String Methods
//        System.out.println(name.length());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        name=name.toUpperCase();
//        System.out.println(name);
//        char n0=name.charAt(0);
        // A    y     a
        // 0    1     2   index
        // yellow  warning
        //red error
        // ما تشرحي هاي الميثود لانه اياد مكفي وموفي
        // جيبي ميثودس اضافية
        // StringIndexOutOfBoundException
        // print the last char
        String message="Hi from python lab";
        message=message.replaceAll("python", "java");
        System.out.println(message);
        message.replaceAll("python", "");
        // concat
        
//        boolean x=name.contains("python");
        
//        String names= "Aya , Ahmed , Khalid , sami";
//        System.out.println(names.contains("ali"));
// the search is case sensitive
// make the search case insensitive


//message.indexOf("Hi"); if the text does not exsit return -1

    
        
        // substring
//        String fileName="aya.txt";
//        fileName.substring(n0,n1);// from n0 to n1-1
        
        
        
        
//     String fullName="Aya Nabil";
//     int spaceIndex=fullName.indexOf(" ");
//     String firstName=fullName.substring(0,spaceIndex);
//     String lastName=fullName.substring(spaceIndex+1);
//     System.out.println(firstName);
//     System.out.println(lastName);
        
        
        
        // equals  , password.equal(input)
        // the difference between == and equals
        // equalsIgnoreCase
        //startsWith
        //endsWith
        
        
        
        
        
        // lec 9
        // boolean isEmal=email.contains("@");
        // boolean isURL=url.startsWith("http);
        
        
        // trim
//        String a="Ahmed";
//        String b="Omar";
//        int result=a.compareTo(b);
//        System.out.println(result);
//        char x=66;
//        System.out.println(x);
//            int zz = 'A';
//        System.out.println(zz);
        
        
//        String name="Aya Nabil"; // convert it to UpperCase And return the lastName
        
        
        



String xx="name is name bbb name";
        System.out.println(xx.replaceAll("name", "ahmed"));

        
        
        
        
        
//        String x="Hello World";
//        x.toLowerCase().substring(5);
        
        
        
        
        







char ch = 'A';
int ascii = ch;
System.out.println("ASCII of A: " + ascii);
// Output: ASCII of A: 65
char ch2 = 66;
System.out.println("Char: " + ch2);
// Output: Char: B




    }
}
