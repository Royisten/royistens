package trail_codes;

import java.util.Scanner;
//function with arguments but no return value
public class functon4 {
      public static void main (String []args){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("enter the 1st value to add");
        a=s.nextInt();
        System.out.println("enter the 2nd value to add");
        b=s.nextInt();
        TwoSum(a, b);
        s.close();
} 
public static int TwoSum(int numa, int numb){

    int c;
    c=numa+numb;
    System.out.println("Result is"+c);
    return(0);
}
}
