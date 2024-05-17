package inheritance_java;

import java.util.Scanner;

public class maintest {
    public static void main (String onetwo[]){
        Scanner s = new Scanner(System.in);
      test02 inherit = new test02();
      inherit.display01();
      inherit.display02();
      System.out.println("test 01 : "+inherit.a+ "\n" +"test 02 : "+ inherit.m);
      s.close();
      
    }
}
