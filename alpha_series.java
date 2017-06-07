import java.util.Scanner;
import javax.swing.*;
public class alpha_series extends JFrame{
   static Scanner sc=new Scanner(System.in);
   static int i=0,j=0;
   static char alph;
   static JTextArea jarea;
   public static void display(){
       new alpha_series();
   }
   alpha_series(){
       super("ALPHABET SERIES");
       setSize(500,500);
       int n=Integer.parseInt(JOptionPane.showInputDialog("Enter n: "));
       jarea=new JTextArea(2*n,2*n);
       add(jarea);
       setVisible(true);
       setResizable(false);
       pack();
       setResizable(false);
       print(n);
   }
   public static void print(int n){
       for(i=0;i<n;i++){
           for(j=0,alph='a';j<n-i;j++,alph++) jarea.append(alph+"");
           for(j=0;j<i;j++) jarea.append("  ");
           if(i==0)
            for(j=0,alph--;alph>='a';j++,alph--) jarea.append(alph+"");
           for(j=0,alph--;alph>='a';j++,alph--) jarea.append(alph+"");
           jarea.append("\n");
       }
       for(i=2;i<=n;i++){
           for(j=1,alph='a';j<=i;j++,alph++) jarea.append(alph+"");
           for(j=1;j<=n-i;j++) jarea.append("  ");
           for(j=1,alph--;j<=i;j++,alph--)jarea.append(alph+"");
           jarea.append("\n");
       }
   }
}