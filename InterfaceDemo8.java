 
interface A
{ 
    int no = 11;
    void fun();
    default void gun()
    {
        System.out.println("inside gun"); //new update 2024
    }

}
 
class Demo implements A  //multiple inherit  
{
    public void fun()
    { 
        System.out.println("inside fun");    

    }
}
class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
         

         
    }
}