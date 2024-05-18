package constructor_java;

import java.util.Scanner;

public class this_constructor {
    // Declaring instance variables a1 and b1
    int a1,b1;
    // Constructor of the class which takes two integer parameters k and l
    this_constructor(int k, int l){
         // Local variable m to store the sum of k and l
        int m;
         // Calculating the sum of k and l and assigning it to m
        m=k+l;
         // Printing the sum of k and l
        System.out.println(m);
         // Using 'this' keyword to refer to the current object's instance variables
        this.a1=k;
        this.b1=l;
         // Printing the values of instance variables a1 and b1
        System.out.println(a1+""+b1);
    }
    // Method to calculate and print the sum of instance variables a1 and b1
     public void sum (){
        Scanner s = new Scanner(System.in);
        // Local variable y to store the sum of a1 and b1
        int y;
         // Calculating the sum of instance variables a1 and b1 and assigning it to y
        y = this.a1 +this.b1;
         // Printing the sum of a1 and b1
        System.out.print(y);
        s.close();
    }
   

}
