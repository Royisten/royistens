package JavaOOPS;
//SAMPLECLASS 
public class SAMPLECLASS{
    int a;
    int b;
    int c;
    void displayA(){
        System.out.println(a);
    }
    void displayB(){
        System.out.println(b);
    }
    void calculatesum(){
        c=a+b;
    }
    
    //function with arguments and not a return value
    void calsum2(int f, int g){
        c=f+g;
    }
    void Printsum(){
        //u can also call a function inside a class
        //and when a object is created for this class and is called both the function and function inside it will run 
        calculatesum();
        System.out.println(c);
    }
    void printsum2(){
        
        System.out.println(c);
    }
    void printsum3(int f,int g){
        calsum2(f,g);
        System.out.println(c);
    }
}
