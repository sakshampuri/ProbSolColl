import javax.swing.*;
public class q6Series
{
   public static void display(){
       char in='c';
       int n=0;
       try{
        in=JOptionPane.showInputDialog("a. 7+77+777...n\nb.1+x^2+x^3+x^4\nEnter Choice:\n").charAt(0);
        n=Integer.parseInt(JOptionPane.showInputDialog("Enter n:"));
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"ERROR!");
       }
       if(in=='a')new q6Series().s1(n);
       else if(in=='b')new q6Series().s2(n);
       else {
           JOptionPane.showMessageDialog(null,"Invalid Choice.");
           display();
        }
    }
   public void s1(int n){
       int sum=0;
       for(int i=1,j=7;i<=n;i++,j=(j*10)+7)
        sum+=j;
       JOptionPane.showMessageDialog(null,"Result: "+sum);
    }
   public void s2(int n){
       int x=Integer.parseInt(JOptionPane.showInputDialog("Enter X: "));
       double sum=1,j=Math.pow(x,2);
       for(int i=1;i<n;i++,j=Math.pow(x,i+1))
        sum+=j;
       JOptionPane.showMessageDialog(null,"Result: "+sum);
    }
}