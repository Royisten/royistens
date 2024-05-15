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
    void Printsum(){
        //u can also call a function inside a class
        //and when a object is created for this class and is called both the function and function inside it will run 
        calculatesum();
        System.out.println(c);
    }
    //function with arguments and not a return value
    void calsum2(int f, int g){
        c=f+g;
    }
    void printsum2(){
        System.out.println(c);
    }
}
