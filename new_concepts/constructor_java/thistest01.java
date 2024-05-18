package constructor_java;

import java.util.Scanner;

public class thistest01 {
    public  static void main (String usingTHIS[]){
         // Creating an object 'o' of the class 'this_constructor' with parameters 6 and 5
        this_constructor o = new this_constructor(6, 5);
        // Calling the 'sum' method on the created object to print the sum of instance variables
        o.sum();
        Scanner s = new Scanner(System.in);
        System.out.print("\n");
        s.close();

    }
    
}
