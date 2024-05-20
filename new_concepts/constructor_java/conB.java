package constructor_java;
//
public class conB extends conA{
    
    void display(){
        System.out.println("method in B");
        //super.display();// using super   //remove(//)before execution
    }
    conB(){
        System.out.println("it's constructor-B");
    }
    conB(int b){
        super(25);// using super to print the argument constructor(conA) along with (conB)
        System.out.println("It's  B Constructor with argument : "+ b);
    }
    
    public static void main (String polymorhismTEST[]){
        //conB b = new conB();            //remove(//)before execution
        
        //b.display();                    //remove(//)before execution

        /*
        here the constructor of A is called first and then B constructor after,
        which means the  base class works first in case of constructor is called (it has different name ).
        but for the method "display()" (both in A & B) only the method in B is called , since it is overriden. 
        To print Method in A we need too use "super" or we can make an object for method A in main method
        which is added to the method display() in conB */
        
        // creating an instance of conA to print both its constructor
        //(which can already be printed when instance of conB is called , since conB inherit conA), 
        //and the method "diplay()".
        
        //conA a = new conA();          //remove(//)before execution
        //a.display();                  //remove(//)before execution
        
        //conB b1 = new conB(5);        //remove(//)before execution

        // here when the constructor of "conB" with argument is called (which exist both in base and sub class) ....
        // so the output will be "It's constructor-A It's  B Constructor with argument : (given value)"
        // here what happens is the base constructorwithout argument is called , 
        // then the sub class constructor with argument is then called
        // since conB has inherited conA.

        // to overcome this we used "super" along with the argument constructor of (conB)  
    }
}