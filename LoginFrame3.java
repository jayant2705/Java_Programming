import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements  ActionListener
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel,Passlabel,Resultlabel;

    public MarvellousLogin(String title,int width, int height)
    {

    fobj = new JFrame(title);
    fobj.setSize(width,height);

    Userlabel = new JLabel("User Name");
    Userlabel.setBounds();

    tobj = new JTextFeild();
    tobj.setBounds();

    Passlabel = new Jlabel("Password");
    Passlabel.setBounds();

    pobj = new JPasswordFeild();
    pobj.setBounds();

    bobj = new JButton("SUBMIT");
    bobj.setBounds();

    Resultlabel = new JLabel("");
    Resultlabel.setBounds();

    fobj.add(bobj);
    fobj.add(tobj);
    fobj.add(pobj);
    fobj.add(Userlabel);
    fobj.add(Passlabel);
    fobj.add(Resultlabel);

    fobj.addAction

    fobj.setVisible(true);
    fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void main actionPerformed(ActionEvent aobj)
    {

    }
}
class LoginFrame3
{
    public static void main(String A[]) 
    {
        MarvellousLogin mobj = new MarvellousLogin(title:"Login",width:500,height:300);
    }
}