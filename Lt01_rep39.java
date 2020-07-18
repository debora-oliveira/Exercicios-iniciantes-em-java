/*Objetivo      : Calcule a quantidade de grãos contidos em um tabuleiro 
de xadrez onde:
                    Casa: 1 2 3 4 ... 64
                    Qdte: 1 2 4 8 ... N
                   Este código fonte será salvo no arquivo
                   Lt01_rep39.java
Programadora    : Débora Oliveira
Data            :21/08/2018
 */
public class Lt01_rep39 {
    public static void main(String[] args){
        double casa=1,qtde=1;
        do{
            System.out.println( casa + "  " + qtde);
            casa++;
            qtde+=qtde;
        } while(casa<=64);
    }
    
}
