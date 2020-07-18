/*Objetivo      : Coletar o valor do lado de um quadrado, 
                   calcular sua área e apresentar o resultado
                   Este código fonte será salvo no arquivo
                   Lt01_seq01.java
Programadora    : Débora Oliveira
Data            :02/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq01 {
    public static void main(String args[]){
        int lado,area;
        lado = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor para lado: "));
        area = (lado*lado);
        System.out.println("A área é " + area);
    }
    
}
