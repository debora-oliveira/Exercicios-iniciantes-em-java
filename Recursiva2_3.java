/*Objetivo: 1/n+2/(n-1)+3/(n-2)+...+1/1
        (1/5)+(2/4)+(3/3)+(4/2)+(5/1)=0,2+0,5+1+2+5=8,7
Programadora: Débora Oliveira
Data:06/09/2018
*/
import javax.swing.JOptionPane;
public class Recursiva2_3 {
    public static void main(String[] args){
        double num;
        num=Double.parseDouble(JOptionPane.showInputDialog("Digite um número "));
        JOptionPane.showMessageDialog(null, Recursiva2_3(1,num));
    }
    static double Recursiva2_3(double n2,double n){
        double soma;
       
        if(n==1){
            return n2;
        }else{
            
            return soma= n2/n + Recursiva2_3(n2+1,n-1);
        }
    }
}
