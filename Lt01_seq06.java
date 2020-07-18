/*Objetivo      : Receba os valores em x e y.
                  Efetua a troca de seus valores e mostre seus conteúdos.
                  Este código fonte será salvo no arquivo
                  Lt01_seq06.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq06 {
    public static void main (String args[]){
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para A "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para B "));
        c = a;
        a = b;
        b = c;
        System.out.println("Novo valor para A " + a);
        System.out.println("Novo valor para B " + b);
    }
}
