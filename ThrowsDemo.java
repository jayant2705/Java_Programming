class Demo
{
    public int Division(int iNo1, int iNo2) throws ArithematicException
    {
        int iAns = 0;
        iAns = iNo1 / iNo2;
        return 0;
    }
}


class ThrowsDemo
{
public static void main(String A[])
    {
        Demo dobj = new Demo();
        int iret = 0;
        
        try
        {
            ret = obj.Division(11,0);

        }
        catch(ArithematicException aobj)
        {
            System.out.println(" Inside catch");
             System.out.println(aobj);
        }
         System.out.println(" Division is: "+iret);
    }
}