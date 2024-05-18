package JavaOOPS;

import java.util.Scanner;

public class testoops {
   static int b=25; // static variable b initialized to 25

    public static void main(String test1[]){
        //testoops h =new testoops();
        //testoops h1 = new testoops();
        //h.b = 122;// modifies the static variable b to 122
        //h1.b=125;// modifies the same static variable b to 125
        //b=2550;// directly modifies the static variable b to 2550

        //System.out.println(h.b); // prints the current value of b, which is 2550
        
        /* In Java, a static variable belongs to the class rather than any instance of the class. 
        This means that there is only one copy of the static variable, regardless of how many instances of the class are created.
        When you modify a static variable, it affects the single shared copy.
        */
        
        // calling the method display
        display();
        //we can also directly call the class variable "a" since main is also a static
       Scanner s = new Scanner(System.in);
       System.out.println(test.a);
    s.close();
    }
    //creating a staic method so that we can asses "a" without creating a object of "test.java" 
    // since "a" is declared as a static 
     static void display(){   
         Scanner s= new Scanner(System.in);
        //calling directly a as we no need to create an object "since a is a static"
        System.out.println(test.a);
        s.close();
    }
}
