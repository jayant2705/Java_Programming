class Hello
{
   public int i;
   public Hello(int no)

   {
      System.out.println("Inside the constructor");
      this.i=11;
   } 
}
class Demo extends Hello
{
    
    public int i;
    
    public Demo(int a)
    {
        super(a);
        System.out.println("Inside Default");
        
        this.i=11; //first use
    }
     
    public void Display()
    {
        System.out.println("Inside Display"+this.i);//third use
        

    }
}



class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
         

    }
}