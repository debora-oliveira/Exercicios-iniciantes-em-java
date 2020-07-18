/*Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e 
um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente.
Programadora:   Débora Oliveira
Data:       14/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq23 {
    public static void main (String args[]){
        int n1, n2 , n3, n4;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog
                                                      ("Digite outro número"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog
                                                       ("Digite outro número"));
        if (n1 < n2 && n2 <n3){
            n4 = Integer.parseInt(JOptionPane.showInputDialog
                                                       ("Digite outro número"));
            if (n4 < n1){
                System.out.println(n4 + "," + n1 + "," +  n2 + "," + n3 );
            }else{
                if (n4 < n2 && n4 > n1) {
                    System.out.println(n1 + "," + n4 + "," +  n2 + ","+ n3);
                }else{
                    if (n4>n2 && n4<n3) {
                        System.out.println(n1 + ","+ n2 + "," + n4 + "," + n3 );
                    }else{
                        System.out.println(n1 + ","+n2+","+n3+","+n4);
                    }
                }
            }
        }
    }
    
}
