package inheritance_java;

public class Z01_man {

  //----------------------------------------------------------------------------------------------------------------------------------------------
  //static Z01_beast beast01;
  //static Z01_bird bird01;
    
    /* These lines declare two static variables,
    beast01 and bird01, of types Z01_beast and Z01_bird, respectively.
    The static keyword indicates that these variables belong to the class Z01_man itself, 
    rather than to instances of the class */

    // this let the method works if its not decalred as a static*

  //static{
        //beast01 = new Z01_beast();
        //bird01 = new Z01_bird();
  //}

    /*This is a static block, which is used to initialize the static variables.
     It gets executed when the class is first loaded into memory. In this block,
     beast01 is assigned a new instance of Z01_beast, 
     nd bird01 is assigned a new instance of Z01_bird
     */

    //-------------------------------------------------------------------------------------------------------------------------------------------- 
    public static void main (String tryingMulti[]){

     }
     void captures(){
        System.out.println("man captures");
      }
      void beast02(){
        Z01_beast.run();
        //if its was not static we should have used beast01.run(); 
      }
      void bird02(){
        Z01_bird.fly();
        //if its was not static we should have used bird01.fly():
      }
    }

