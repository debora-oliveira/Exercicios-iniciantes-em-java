/*Objetivo      : Receba a base e a altura de um triângulo.
                  Calcule e mostre a sua área.
                  Este código fonte será salvo no arquivo
                  Lt01_seq03.java
Programadora    : Débora Oliveira
Data            :02/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq03 {
    public static void main (String args[]){
        int base,altura,area;
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite altura: "));
        base = Integer.parseInt (JOptionPane.showInputDialog("Digite a base: "));
        area = (base*altura) / 2;
        System.out.println("A área do triângulo é " + area);
    }
    
}
