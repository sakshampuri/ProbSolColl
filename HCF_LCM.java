import java.util.Scanner;
import javax.swing.JOptionPane;
public class HCF_LCM
{
   static int n1,n2,i,HCF,LCM;
   public static void display(){
       HCF_LCM call=new HCF_LCM();
       call.input();
       JOptionPane.showMessageDialog(null,"HCF= "+call.HCF_calc(n1,n2)+"\nLCM="+call.LCM_calc(n1,n2));
   }
   public void input(){
       try{
           n1=Integer.parseInt(JOptionPane.showInputDialog("Enter The First Number"));
           n2=Integer.parseInt(JOptionPane.showInputDialog("Enter The Second Number"));
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Not an Integer", "ERROR", JOptionPane.INFORMATION_MESSAGE);
           input();
       }
   }
   public int HCF_calc(int nr1,int nr2)
   {
        for(i=1;i<=((nr1>nr2)?nr1:nr2);i++)
         if(nr1%i==0 && nr2%i==0)
           HCF=i;
        return HCF;
   }
   public int LCM_calc(int nr1,int nr2)
   {
       try{
        for(i=1;;i++)
          if(i%nr1==0 && i%nr2==0){
              LCM=i;
              break;
          }
       } catch(Exception e){
           JOptionPane.showMessageDialog(null,"ERROR: \n"+e, "ERROR", JOptionPane.INFORMATION_MESSAGE);
       }
       return LCM;
   }
}