package inheritance_java;

import java.util.Scanner;

public class Z01_multi_inherit  extends Z01_man{
    public static void main (String animalkingdom[]){
        Z01_man show = new Z01_man();
    Scanner s = new Scanner(System.in);
    System.out.println("I'sm the main");
     show.captures();
     show.beast02();
     show.bird02();
     s.close();
    }
}
/*
 * this is just a sample i did to try to acheive multiple inheritance by just using oops and inheritance
 * the result is that it prints three outputs of three different methods from a single program including it's own output
 */