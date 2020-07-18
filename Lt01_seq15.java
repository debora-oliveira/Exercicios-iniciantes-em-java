/*Objetivo      : Receba os valores de 2 catetos de um triângulo retângulo.
                  Calcule e mostre a hipotenusa.
                  Este código fonte será salvo no arquivo
                  Lt01_seq15.java
Programadora    : Débora Oliveira
Data            :08/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq15 {
    public static void main (String args[]){
        int cat1, cat2, hip;
        cat1 = Integer.parseInt(JOptionPane.showInputDialog
                                           ("Digite valor do primeiro cateto"));
        cat2 = Integer.parseInt(JOptionPane.showInputDialog
                                            ("Digite valor do segundo cateto"));
        hip = (cat1*cat1)+(cat2*cat2);
        System.out.println("O valor da hipotenusa é " + hip);
    }
    
}
