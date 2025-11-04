class Demo extends Thread 
{
    public void run()
    {
        System.out.println("Inside run method of : "+Thread.currentThread().getName());
    }

}
class ThreadUserDefinedJionX
{
    public static void main(String A[])throws InterruptedException
    {
        System.out.println("Inside Main thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();



        dobj1.setName("first");
        dobj2.setName("second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

         System.out.println("End of Main thread");

    }
}