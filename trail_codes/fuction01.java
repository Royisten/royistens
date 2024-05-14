package trail_codes;

import java.util.Scanner;
// trying functions in java:)
// fuctions without arguments and eturn value 
public class fuction01 {
    public static void main (String []args){
        Scanner sca= new Scanner(System.in);
        
        int prompt;
        int Y = 0;
        
        System.out.println("press 0 for addition or get a wink");
        prompt=sca.nextInt();
        if (prompt==Y) {
            twosum();
        } else {
            System.out.println(";)");
            
        }
        
       
        
        sca.close();
    }

    public static int  twosum(){
        Scanner sca= new Scanner(System.in);
        int num1,num2;
        System.out.println("first value");
        num1=sca.nextInt();
        System.out.println("Second value");
        num2=sca.nextInt();
        int result= num1+num2;
        System.out.println("the result is "+ result );
        sca.close();
        return 0;
    }
}
