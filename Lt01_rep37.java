/*Objetivo      :  Receba um número inteiro. Calcule e mostre a série de 
                   Fibonacci até o seu N'ésimo termo.
                   Este código fonte será salvo no arquivo
                   Lt01_rep37.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */

// 1 1 2 3 5 8 13 21 ...
import javax.swing.JOptionPane;
public class Lt01_rep37 {
    public static void main(String args[]){
        int v1= -1, v2= 1, v3, cont=0,limite;
        limite = Integer.parseInt(JOptionPane.showInputDialog
                                                    ("Digite um limite"));
        do {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
            System.out.print(v3 + "  ");
            cont++;
        } while (cont<limite);
    }
     
    
}
