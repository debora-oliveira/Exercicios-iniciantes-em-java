/*Objetivo      : Receba os coeficientes A, B e C de uma equação do 2º grau
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).
                  Este código fonte será salvo no arquivo
                  Lt01_seq05.java
Programadora    : Débora Oliveira
Data            :05/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq05 {
    public static void main (String args[]){
        int a,b,c,delta,x1,x2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite coeficiente para a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite coeficiente para b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite coeficiente para c: "));
        delta = (b*b)-4*a*c;
        int r = (int) Math.sqrt(delta);
        x1 = ((-b) + r)/2*a;
        x2 = ((-b) - r)/2*a;
        System.out.println("Primeira raiz da equação " + x1);
        System.out.println("Segunda raiz da equação " + x2);
    }
    
}
