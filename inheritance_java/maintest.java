package inheritance_java;

import java.util.Scanner;
//Test showing that a method can be called from an another class,
//Using inheritance   
public class maintest {
    public static void main (String onetwo[]){
        
      Scanner s = new Scanner(System.in);
      
        //object "inherit" created of  class "test02".
      test02 inherit = new test02();
      //here, "display01" method belongs to class "test01" but can be called using the object of "test02" ,
      //since "test02" inherited "test01"
      inherit.display01();
      //calling method from class  "test02" using oops.
      inherit.display02();
      //displaying values that are declared in both classes "test01 ; a" and 
      // "test02 ; m" which can be called directly using the object of class "test02"
      //since "test02" inherited "test01"
      System.out.println("test 01 : "+inherit.a+ "\n" +"test 02 : "+ inherit.m);
      s.close();
      
    }
}
