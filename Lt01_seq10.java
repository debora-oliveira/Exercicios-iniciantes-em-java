/*Objetivo      : Receba 2 números reais.
                  Calcule e mostre a diferença desses valores.
                  Este código fonte será salvo no arquivo
                  Lt01_seq10.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq10 {
    public static void main(String args[]){
        double n1,n2,dif;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        dif = n1-n2;
        System.out.printf("A diferença é %.2f \n", dif);
    }
    
}
