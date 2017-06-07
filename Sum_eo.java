import javax.swing.JOptionPane;
public class Sum_eo
{
   static int r1,e,o,r2;
   public Sum_eo(){
       r1=0;
       e=0;
       o=0;
       r2=0;
   }
   static void display(){
       Sum_eo call=new Sum_eo();
       call.input();
       call.Calc();
       JOptionPane.showMessageDialog(null,"Sum of Even: "+e+"\nSum of Odd: "+o, "RESULT", JOptionPane.INFORMATION_MESSAGE);
   }
   public void input(){
       r1=Integer.parseInt(JOptionPane.showInputDialog("Enter Starting Range: "));
       r2=Integer.parseInt(JOptionPane.showInputDialog("Enter End Range: "));
   }
   public void Calc(){
       for(;r1<=r2;r1++){
        e+=(r1%2==0)?r1:0;
        o+=(r1%2!=0)?r1:0;
       }
   }
}