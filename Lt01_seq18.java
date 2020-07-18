/*Objetivo: Receba 2 valores inteiros. 
Calcule e mostre o resultado da diferença do maior pelo menor.

*/
import javax.swing.JOptionPane;
public class Lt01_seq18 {
    public static void main(String args[]){
        int n1, n2,resultado;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog
                                                        ("Digite outro valor"));
        if (n1 > n2){
            resultado = n1-n2;
            System.out.println
                             ("A diferença do maior pelo menor é " + resultado);
        } else {
            resultado = n2-n1;
            System.out.println("A diferença do maior pelo menor é " + resultado);
        }
    }
    
}
