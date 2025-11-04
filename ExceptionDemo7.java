 import java.util.*;

class ExceptionDemo7
{
    
    public static void main(String A[])
    {

         
         Scanner sobj = new Scanner(System.in);

         int iNo1 = 0, iNo2=0, iAns=0;

         System.out.println("Enter First Number");
         iNo1 = sobj.nextInt();

         System.out.println("Enter Second Number");
         iNo2 = sobj.nextInt();
        try
        {
         System.out.println("Inside try block");
         iAns = iNo1 / iNo2;
        }
        System.out.println("hello"); //error
        catch(ArithmeticException aobj) //specific class
        {
            System.out.println("Inside Catch block");
            System.out.println(aobj);

        }
        catch(Exception eobj)
        {
            System.out.println("Inside Genric Catch "); //genric class
            
        }
        finally 
        {
            System.out.println("Inside finally block ");
    

        }

         System.out.println("Division is :"+iAns);


    }
}