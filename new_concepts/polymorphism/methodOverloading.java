package polymorphism;

public class methodOverloading {
    public static void main (String OverloadingMethod[]){
        methodOverloadingTest test = new methodOverloadingTest();
        test.display();
        test.display(85);
        test.display(24.5);
     /*here we can call the method with the same name "display();" and work it seperately, 
     only if we add a arguments and depending on the type of arguments ,
     we can call the method seperately, which has been classified accordinglyto the type ,
     REFER " methodOverloadingTest" FOR MORE UNDERSTANDING.
    */
    }

}
