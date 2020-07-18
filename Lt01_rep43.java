/*Objetivo      : Calcule e mostre quantos anos serão necessários para que
Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e 
Maria tem 1,5 m e cresce 2 cm ao ano.
                   Este código fonte será salvo no arquivo
                   Lt01_rep43.java
Programadora    : Débora Oliveira
Data            :22/08/2018
 */
public class Lt01_rep43 {
    public static void main (String[] args){
        double ana=1.10,maria=1.50,ano=0;
        do{
            ana=ana+0.03;
            maria=maria+0.02;
            ano=ano+1;
        }while(ana<maria);
        System.out.println
            ("Serão necessários " + ano + " anos para Ana ser maior que Maria");
    }
}
