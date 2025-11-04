import java.util.*;

class ExceptionDemo2
{
    public static void main(String A[])
    {
         
         Scanner sobj = new Scanner(System.in);

        float fNo1 = 0, fNo2=0, fAns=0;

         System.out.println("Enter First Number");
         fNo1 = sobj.nextInt();

         System.out.println("Enter Second Number");
         fNo2 = sobj.nextInt();

         fAns = (float)fNo1 / (float) fNo2;

         System.out.println("Division is :"+fAns);


    }
}