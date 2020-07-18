/*Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
Programadora: Débora Oliveira
Data:23/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq19 {
    public static void main(String args[]){
        double n1 , n2, maior;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        if (n1>n2){
            maior = n1;
            System.out.println("O maior número é " + maior);
        }else{
            maior = n2;
            System.out.println("O maior número é " + maior);        
        }
    }
}
