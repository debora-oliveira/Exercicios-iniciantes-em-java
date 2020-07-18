/*Objetivo      : Receba os 2 números inteiros.
                  Calcule e mostre a soma dos quadrados.
                  Este código fonte será salvo no arquivo
                  Lt01_seq09.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq09 {
    public static void main (String args[]){
        int n1,n2,soma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog
                                                        ("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog
                                                     ("Digite outro número: "));
        soma = (n1*n1)+(n2*n2);
        System.out.println("A soma dos quadrados é " + soma);
    }
    
}
