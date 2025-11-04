 
interface B
{ 
    int no = 11;
    void fun();

}
 
class Demo implements A,B  //multiple inherit  
{
    public void fun()
    { 
        System.out.println("inside fun"+no);   //no genrate error

    }
}
class InterfaceDemo7
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
         

         
    }
}