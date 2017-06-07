import javax.swing.JOptionPane;
public class palPrime
{
    static palPrime call=new palPrime();
    public int input(){return Integer.parseInt(JOptionPane.showInputDialog("Enter The Number: "));}
    public static void display(){
        int n=call.input();
        call.calc(n);
    }
    public void calc(int n){
        if(call.pal(n) && call.prime(n)) JOptionPane.showMessageDialog(null,n+" is a pal prime number!");
        else JOptionPane.showMessageDialog(null,n+" is not a pal prime number!");
    }
    public boolean pal(int n){
        StringBuffer rev=new StringBuffer(String.valueOf(n));
        rev=rev.reverse();
        String str=rev.toString();
        if(str.equalsIgnoreCase(String.valueOf(n))) return true;
        else return false;
    }
    public boolean prime(int n){
        for(int i=2;i<n;i++)
         if(n%i==0) return false;
        return true;
    }
}