import javax.swing.JOptionPane;
public class sum_sq
{
    static int n,i;
    static double sum;
   public sum_sq(){
       n=0;
       i=0;
       sum=0.0;
   }
   public static void display(){
       try{
           n=Integer.parseInt(JOptionPane.showInputDialog("Enter Integer: "));
       } catch(Exception e){
           JOptionPane.showMessageDialog(null,"ERROR!\n"+e);}
       for(i=1;i<=n;i++)
           sum+=Math.pow(i,2);
       JOptionPane.showMessageDialog(null,"Sum of square range: "+sum);
   }
}