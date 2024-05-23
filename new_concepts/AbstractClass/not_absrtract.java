package AbstractClass;

public class not_absrtract extends Is_Abstract {
    //when the absract class is called it required to define it the subclass
    //abstract class with  string argument
    void displayAbstract(String notwow) {
        notwow="this is a test";
        System.out.println("Class : Abstact (extended), Method : Abstract");
        System.out.println(notwow);
    }
    
    public static void main (String ho[]){
    not_absrtract show = new not_absrtract();
    show.NotAbstractDisplay();//calling the orinary class
    show.displayAbstract("work");// calling the absract class with a "string" argument
    
    }
     
    }

