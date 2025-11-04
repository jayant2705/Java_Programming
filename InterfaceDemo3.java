interface Demo
{
    int no = 11;
    void Display();
}

abstract class Hello implements Demo
{
    public void Display()

{
   System.out.println("Inside Display");
}
  }


class InterfaceDemo3
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();    //error

    }
}