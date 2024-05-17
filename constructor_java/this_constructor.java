package constructor_java;

import java.util.Scanner;

public class this_constructor {
    int a1,b1;
    this_constructor(int k, int l){
        int m;
        m=k+l;
        System.out.println(m);
        this.a1=k;
        this.b1=l;
    } public void sum (){
        Scanner s = new Scanner(System.in);
        int y;
        y = this.a1 +this.b1;
        System.out.print(y);
        s.close();
    }
   

}
