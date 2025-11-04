
 
interface A
{ 
    int no = 11;
    void fun();
     private void Dispaly()
    {
        System.out.println("inside private display"); 

    }
    default void gun()
    {
        System.out.println("inside gun"); //new update 2024
        Display();
    }

}
 
class Demo implements A  //multiple inherit  
{
    public void fun()
    { 
        System.out.println("inside fun");    

    }
    
}
class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        //dobj.Display();error
         

         
    }
}
