package trail_codes;

import java.util.Scanner;
// function without arguments but has a return value
public class function5 {
    
      public static void main (String []args){
        Scanner s = new Scanner(System.in);
        int result;
        result=Twosum();
        System.out.print("Sum is : "+result + "\n");
        s.close();
} 
public static int Twosum(){
    Scanner s = new Scanner(System.in);
    int a,b,c;
    System.out.print("enter the 1st value to add : ");
    a=s.nextInt();
    System.out.print("enter the 2nd value to add : ");
    b=s.nextInt();
    c=a+b;
    s.close();
    return(c);
    
}
}
