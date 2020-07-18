/*Objetivo  : Mostre todas as possibilidades de 2 dados
                de forma que a soma tenha como resultado 7.
              Este código fonte será salvo no arquivo
              Lt01_rep41.java
Programadora  : Débora Oliveira
Data          :21/08/2018
 */
public class Lt01_rep41 {
    public static void main(String[] args){
        System.out.println("Soma de dois dados que resultam 7:");
        int dado1, dado2,soma7;
        for(dado1=1;dado1<8;dado1++){
            for(dado2=1;dado2<8;dado2++){
                soma7=dado1+dado2;
                if(soma7==7){
                    System.out.println(dado1 + " + " + dado2 + " = " + soma7);
                }
            }
        }
    }
    
}
