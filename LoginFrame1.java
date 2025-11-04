import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin
{
    public MarvellousLogin(String title,int width, int height)
    {

    JFrame fobj = new JFrame(title);
    fobj.setSize(width,height);
    fobj.setVisible(true);
    fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class LoginFrame1
{
    public static void main(String A[]) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Login");
    }
}