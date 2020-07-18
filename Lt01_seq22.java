/*Objetivo:. Receba 2 valores inteiros e diferentes.
Mostre seus valores em ordem crescente.
Programadora: Débora Oliveira
Data:23/08/2018 
 */
import javax.swing.JOptionPane;
public class Lt01_seq22 {
    public static void main(String args[]){
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog
                                                      ("Digite outro número"));
        if (n1>n2){
            System.out.println(n2 + " , " + n1);
        }else{
            System.out.println(n1 + " , " + n2);
        }
    }
    
}
