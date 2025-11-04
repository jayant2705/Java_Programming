class Demo extends Thread 
{
    public void run()
    {
 int i =0;
 try
 {
     for(i=1; i<=5; i++)
     {
        Thread.sleep(1000);
        System.out.println("Inside run method of : "+Thread.currentThread().getName());
     }

}
catch(InterruptedException xobj)
        { }
        
    }

}
class ThreadUserDefinedSleepX
{
    public static void main(String A[]) 
    {
        System.out.println("Inside Main thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("second");

        //Check Exception
        try
        {
            dobj1.start();
            dobj1.join();
             
         
            dobj2.join();
            dobj2.start();

        }
        catch(InterruptedException iobj)
        { }

         System.out.println("End of Main thread");

    }
}