package AbstractClass;

public class not_absrtract extends Is_Abstract {
    
    void displayAbstract() {
        System.out.println("Class : Abstact (extended), Method : Abstract");
    }
    public static void main (String ho[]){
    not_absrtract show = new not_absrtract();
    show.display();
    show.displayAbstract();
    }
     
    }

