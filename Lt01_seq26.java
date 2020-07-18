/*Objetivo: Receba 2 números inteiros.
Verifique e mostre se o maior número é múltiplo do menor.
Programadora: Débora Oliveira
Data: 19/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq26 {
    public static void main(String args[]){
        int n1 , n2 , mult;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
       if (n1>n2){
           mult = n1%n2;
            if (mult == 0 ){
            System.out.println( n1 + " é multiplo de " + n2);
        }
                }else{
                if(n2>n1){
                    mult = n2%n1;
                     if (mult == 0 ){
            System.out.println( n2 + " é multiplo de " + n1);
        }
            }
       }
    }
    
}
