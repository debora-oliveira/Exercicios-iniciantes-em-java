/*Objetivo: coletar um n positivo calcular e mostrar:
n+(n-1)+n(n-2)+...+1
*/
import javax.swing.JOptionPane;
public class Recursiva2 {
    
    public static void main(String[] args){
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
        JOptionPane.showMessageDialog(null, Recursiva2(n));
    }
    static int Recursiva2(int n1){
        int num;
        if(n1!=1){
            num = n1 +Recursiva2(n1-1);
            return num;
        }
        else
        {
          return n1;    
        }
        
    }
}
        
     
