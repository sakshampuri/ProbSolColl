import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menu extends JFrame implements ActionListener{
    private JButton sn,eo,hcf_lcm,ser,q6ser,palPrime,alph,sum_sq;
    private ButtonGroup group;
    public menu(){
        super("MENU");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(230,310);
        setLayout(new FlowLayout());
        sn=new JButton("Special Numbers From 1 - 100");
        eo=new JButton("Sum of even and odd numbers");
        hcf_lcm=new JButton("HCF and LCM Calculator");
        ser=new JButton("   Series  ");
        q6ser=new JButton("Question 6 Series");
        palPrime=new JButton("Check for Pal Prime Number");
        alph=new JButton("Alphabets Series");
        sum_sq=new JButton("Sum of Squares of Numbers");
        add(sn);
        add(eo);
        add(hcf_lcm);
        add(ser);
        add(q6ser);
        add(palPrime);
        add(alph);
        add(sum_sq);
        add(new JLabel("Saksham Puri XI-S2"));
        sn.addActionListener(this);
        eo.addActionListener(this);
        hcf_lcm.addActionListener(this);
        ser.addActionListener(this);
        q6ser.addActionListener(this);
        palPrime.addActionListener(this);
        alph.addActionListener(this);
        sum_sq.addActionListener(this);
        setVisible(true);
        setResizable(false);
        this.getContentPane().setBackground(Color.ORANGE);try{
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){}
    }
    public void actionPerformed(ActionEvent e){
        String str=e.getActionCommand();
        if(str.equalsIgnoreCase("Special Numbers From 1 - 100")) Special_Numbers.display();
         else if(str.equalsIgnoreCase("Sum of even and odd numbers")) Sum_eo.display();
          else if(str.equalsIgnoreCase("HCF and LCM Calculator")) HCF_LCM.display();
           else if(str.equalsIgnoreCase("   Series  ")) series.display();
            else if(str.equalsIgnoreCase("Question 6 Series")) q6Series.display();
             else if(str.equalsIgnoreCase("Check for Pal Prime Number")) new palPrime().display();
              else if(str.equalsIgnoreCase("Alphabets Series")) alpha_series.display();
               else if(str.equalsIgnoreCase("Sum of Squares of Numbers")) new sum_sq().display();
    }
    public static void main(String args[]){
        new menu();
    }
}