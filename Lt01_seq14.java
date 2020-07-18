/*Objetivo      : Receba 2ângulos de um triângulo.
                  Calcule e mostre o valor do 3º ângulo.
                  Este código fonte será salvo no arquivo
                  Lt01_seq14.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq14 {
    public static void main (String args[]){
        int ang1,ang2,ang3;
        ang1 = Integer.parseInt(JOptionPane.showInputDialog
                                               ("Digite o valor de um ângulo"));
        ang2 = Integer.parseInt(JOptionPane.showInputDialog
                                            ("Digite valor do segundo ângulo"));
        ang3 = (180-ang1)-ang2;
        System.out.println("O valor do terceiro ângulo é " + ang3);
    }
    
}
