/*Objetivo      : Receba 2 números inteiros.
              Verifique e mostre todos os números primos existentes entre eles.
                   Este código fonte será salvo no arquivo
                   Lt01_rep40.java
Programadora    : Débora Oliveira
Data            :21/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep40 {
    public static void main (String[] args){
        int
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:")),
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:")),
            cta , menor = 0, maior = 0, primo = 1;
        
        // Identificação do maior e menor número
        
        if (n1 < n2){
            menor = n1;
            maior = n2;
        }else if (n1 > n2){
            menor = n2;
            maior = n1;
        }else{
            System.out.println("Números NÃO podem ser iguais!");
        }
        
        //Mostra os números primos entre os dois
        
        while(menor <= maior){
            for(cta = 2 ; cta < menor ; cta ++){
                if (menor % cta == 0){
                    primo = 0;
                    break;
                }
            }
            if (primo == 1){
                System.out.println(menor);
            }
            menor++;
            primo = 1;
        }
    }
     
}
        
 

