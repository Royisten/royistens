package trail_codes;
import java.util.Scanner;

public class string_eg {
    public static void main (String []args){
        Scanner steg= new Scanner(System.in);
        //create a string variable "name"
        String name;
        System.out.println("Enter your name");
        //read & stores the given "characters" in name* 
        name=steg.nextLine();
        //prints name**
        System.out.println("Hi "+name+" :)");
        steg.close();
    }
}
