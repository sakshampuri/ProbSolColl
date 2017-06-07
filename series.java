import java.awt.*;
import javax.swing.*;
public class series extends JFrame
{
    private int i,j,n1,temp,y;
    private String n="";
    private JTextArea textArea;
    public series(){
        super("S");
        n1=Integer.parseInt(JOptionPane.showInputDialog("Enter 'n': "));
        textArea=new JTextArea(n1,2*n1-5);
        textArea.setEditable(false);
        add(textArea);
        setVisible(true);
        pack();
        setResizable(false);
    }
    public static void display(){
        new series().display1();
    }
    void display1(){
        for(i=1;i<=n1;i++)
         n+=String.valueOf(i);
        for(i=n.length(),j=0;i>=0;i--,j++){
          textArea.append(n.substring(0,i));
          if(j!=n.length())
          for(y=0;y<j;y++)
           textArea.append("  ");
           StringBuffer rev=new StringBuffer(n);
           rev=rev.reverse();
           String temp=rev.toString();
          if(i!=0)
           textArea.append(temp.substring(j,n.length())+"\n");
           else
           textArea.append(temp.substring(j,n.length()));}
    }
}