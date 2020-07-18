/*Objetivo      : Receba o ano de nascimento e o ano atual.
                  Calcule e mostre a sua idade e quantos anos
                  terá daqui a 17 anos.
                  Este código fonte será salvo no arquivo
                  Lt01_seq12.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq12 {
    public static void main (String args[]){
        int anoNasci, anoAtual, idade, idade17;
        anoNasci = Integer.parseInt(JOptionPane.showInputDialog
                                            ("Digite seu ano de nascimento "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog
                                                        ("Digite ano atual "));
        idade = anoAtual - anoNasci;
        idade17 = idade + 17;
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua idade daqui 17 anos será " + idade17);
    }
    
}
