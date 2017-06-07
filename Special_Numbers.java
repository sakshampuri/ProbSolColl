import javax.swing.*;
public class Special_Numbers extends JFrame
{
   static int i,j,temp,sum,prod;
   static boolean isSpecial;
   Special_Numbers(){
       super("S N");
       this.setSize(200,100);
       i=0;
       j=0;
       temp=0;
       sum=0;
       prod=1;
       isSpecial=false;
       setVisible(true);
   }
   static void display(){
       new Special_Numbers().display1();
   }
   void display1(){
       JTextField dis=new JTextField(null,40);
       dis.setEditable(false);
       add(dis);
       for(i=1;i<=100;i++){
           if(i>9){
               temp=i;
               while(temp>0){
                   sum+=temp%10;
                   prod*=temp%10;
                   temp/=10;
               }
           }
            else{
                sum+=i;
                prod*=i;
           }
           isSpecial=((sum+prod)==i)?true:false;
           if(isSpecial)
            dis.setText(dis.getText()+i+",");
           sum=0;
           prod=1;
       }
   }
}
                