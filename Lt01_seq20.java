/*Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.
Programadora: Débora Oliveira
Data:23/08/2018 
 */

import javax.swing.JOptionPane;
public class Lt01_seq20 {
    public static void main (String args[]){
        int a ,b, c, delta, x1, x2;
        a = Integer.parseInt(JOptionPane.showInputDialog
                                          ("Digite valor para coeficiente a"));
        b = Integer.parseInt(JOptionPane.showInputDialog
                                           ("Digite valor para coeficiente b"));
        c = Integer.parseInt(JOptionPane.showInputDialog
                                           ("Digite valor para coeficiente c"));
        
        delta = (b*b)-4*a*c;
        int r = (int) Math.sqrt(delta);
        if (a ==0) {
            System.out.println("Não é equação do 2º Grau");
        }else {
            if(delta <0) {
                System.out.println("Nenhuma raiz real");
            }else{
                if (delta ==0){
                    x1 = (-b/2) * a;
                    System.out.println("Única raiz " + x1 );
                }else{
                    x1 = ((-b) + r)/2*a;
                    x2 = ((-b) - r) /2*a;
                    System.out.println("Primeira raiz " + x1);
                    System.out.println("Segunda raiz " + x2);
                }
            }
        }
    }
    
}
