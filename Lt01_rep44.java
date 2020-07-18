/*Objetivo      : Receba o número da base e do expoente.
                  Calcule e mostre o valor da potência.
                   Este código fonte será salvo no arquivo
                   Lt01_res44.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep44 {
    public static void main(String args[]){
        int base,expoente,cta, potencia=1;
        base = Integer.parseInt(JOptionPane.showInputDialog
                                         ("Digite valor da base da potência"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog
                                            ("Digite expoente da potência"));
        for (cta=1; cta<=expoente; cta++){
            potencia=base*potencia;
        }
        System.out.println
  ("A potência de " + base +" elevado a " + expoente + " é igual a " + potencia);
    }
    
}
