/*Objetivo:Receba um valor inteiro.
Verifique e mostre se é divisível por 2 e 3.
 */
import javax.swing.JOptionPane;
public class Lt01_seq24 {
    public static void main(String args[]){
        int num, res1 , res2;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        res1 = num%2;
        res2 = num%3;
        if (res1==0 && res2==0){
            System.out.println("O número " + num + " é divisível por 2 e 3");
    }else{
            System.out.println("O número " + num + " não é divisível por 2 e 3 ");
        }
    }
    
}
