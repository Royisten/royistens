package constructor_java;

public class conA {
    void display(){
        System.out.println("method in A");
    }
    conA (){
        System.out.println("It's constructor-A");
    }
    conA(int a ){
        System.out.println("It's A constructor with arguments : "+ a);
    }
}