package polymorphism;

public class override_mainclass {
    public static void main(String overridetestMain[]){
        override_subclass test = new override_subclass();
        test.display();
        
     // here we created a instance of the sub class which has also inherited the base class ,
     // but when we called the method "display()" which is present both in sub AND base class.
     // the output was " Sub class" which belongs to the sub class method 
     // this is called overriding method where the sub class method override the base class method.
     // if it has the same method name like here "display();"
    }
}
