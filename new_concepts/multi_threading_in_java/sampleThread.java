package multi_threading_in_java;
/*in this method it inherits thread* class
and uses the method run* , in which we intentionally slow 
down the task by giving it a 1000 milliseconds timer by using
the "sleep" method of thread* class ,
this class will be used to show multi threading works,
by witnessing the time it takes to run
*/
public class sampleThread extends Thread
{
/*
run method always comes with try "super.run" when "thread" is inherited
*/
@Override
public void run() 
    {  
    super.run();
    for (int i = 0; i <=10; i++) 
        {
            System.out.println("Thread Count"+i +"\n\t");
            /*and to use thread.sleep we need to
            surrond it by "try" block 
            */
            try 
            {
            Thread.sleep(1000); 
            } 
            catch (InterruptedException e) 
            {
            e.printStackTrace();
            }
            
        }
    }
}
