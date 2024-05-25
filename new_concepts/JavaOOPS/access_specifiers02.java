package JavaOOPS;
import Interface.access_specifies01;

public class access_specifiers02  extends access_specifies01{
    public static void main (String io[]){
        access_specifies01 k1=new access_specifies01();
        k1.display01public();
        
        //k.display01private(); 

        /*this method cannot be asseced since 
        this class is declared as private
        */

         /* 
          access_specifies01 is a super class
          access_specifiers02 is the sub class
         */
        access_specifiers02 k = new access_specifiers02();
        k.display01protected();
        /*
         Same Package: 
           If the subclass is in the same package as the superclass, 
           it can access protected methods through any instance of the superclass.
           
         Different Package: 
           If the subclass is in a different package,
           it can access protected methods only through an instance of the subclass,
           not through an instance of the superclass.
         */
        //k1.display01default();

        /* this method cannot be accessed since
         * it is declared as default
         */

}
}
/* */