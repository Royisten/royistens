package JavaOOPS;

import java.util.Scanner;

public class testoops {
   
    public static void main(String test1[]){
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
