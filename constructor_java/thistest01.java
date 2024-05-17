package constructor_java;

import java.util.Scanner;

public class thistest01 {
    public  static void main (String usingTHIS[]){
        this_constructor o = new this_constructor(6, 5);
        o.sum();
        Scanner s = new Scanner(System.in);
        System.out.print("\n");
        s.close();

    }
    
}
