package JavaOOPS;
// using the same class but a different program with a different object "k"
//using a function with arguments
public class SecondOOPS {
    public static void main (String oopssecondsample[]){
        int numa=12;
        int numb=21;
        int num1=54;
        int num2=45;
        SAMPLECLASS k =new SAMPLECLASS();
        SAMPLECLASS k1 =new SAMPLECLASS();
        k.calsum2(numa, numb);
        k.printsum2();
        k1.calsum2(num1, num2);
        k1.printsum2();

    }
}
