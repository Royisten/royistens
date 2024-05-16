package JavaOOPS;

import java.util.Scanner;

public class testoops {
   static int b=25; // static variable b initialized to 25

    public static void main(String test1[]){
        testoops h =new testoops();
        testoops h1 = new testoops();
        h.b = 122;
        h1.b=125;
        b=2550;
        System.out.println(h.b);
        // for a static variable it would have a seper
        
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
