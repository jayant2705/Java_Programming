class Demo extends Thread 
{
    public void run()
    {
        System.out.println("Inside run method of : "+Thread.currentThread().getName());
    }

}
class ThreadUserDefinedJoinSerialAlive
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
            System.out.println("Is first thread alive ?"+dobj1.isAlive());
            dobj1.join();
            System.out.println("end of first thread");
           
             System.out.println("Is first thread alive ?"+dobj1.isAlive());
            dobj2.join();
            dobj2.start();
            System.out.println("end of second thread");
            

        }
        catch(InterruptedException iobj)
        {

        }
        

         System.out.println("End of Main thread");

    }
}