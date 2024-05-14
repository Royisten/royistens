package trail_codes;

import java.util.Scanner;
//function without ARGUMENTS and  no RETURN VALUE
// (2)
public class function2 {
    public static void main(String[]args){
        threesum();

    }
    public static void threesum(){
        Scanner so=new Scanner(System.in);
        int no1,no2,no3,sum;
        System.out.print(" 1st value to add : ");
        no1=so.nextInt();
        System.out.print(" 2nd value : ");
        no2=so.nextInt();
        System.out.print(" 3rd value : ");
        no3=so.nextInt();
        sum=no1+no2+no3;
        System.out.print("Result is : " +sum +"\n" );

        so.close();
        //testgit 
        // for a void function there is no need for a return value

    }
}
