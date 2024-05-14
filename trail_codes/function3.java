package trail_codes;

import java.util.Scanner;
// function with arguments and return value
public class function3 {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("enter the 1st value to add");
        a=s.nextInt();
        System.out.println("enter the 2nd value to add");
        b=s.nextInt();
        int result=Twosum(a, b);
        System.out.print("result is : " + result);
        s.close();

    }
    public static int Twosum(int numa, int numb){
        int c;
        c=numa+numb;
        return(c);
    }
}
