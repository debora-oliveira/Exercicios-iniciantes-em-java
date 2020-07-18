/*Objetivo: série2_2 1/n+1(n-1)+1/(n-2)+...+1/1
                     (1/6)+(1/5)+(1/4)+(1/3)+(1/2)+(1/1)=soma
Programadora: Débora Oliveira
Data:06/09/2018
*/
import javax.swing.JOptionPane;
public class Recursiva2_2 {
    public static void main(String[] args){
        double n;
        n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número "));
        JOptionPane.showMessageDialog(null, Recursiva2_2(n));
    }
    static double Recursiva2_2(double num){
        if(num==1){
            return 1;
        }else{
            return +1/num+Recursiva2_2(num-1);
        }
    }
}
