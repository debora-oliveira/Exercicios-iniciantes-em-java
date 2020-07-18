/*Objetivo: Receba 4 notas bimestrais de um aluno. 
Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.

 */
import javax.swing.JOptionPane;
public class Lt01_seq21 {
    public static void main(String args[]){
        Double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite 1ª Nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite 2ª Nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite 3ª Nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite 4ª Nota"));
        media = (n1 + n2 + n3 + n4)/4;
        System.out.println("A nédia é " + media);
        if (media >= 6.0 ){
            System.out.println("Aprovado!");
        }else{
            if (media>= 3.0 && media<6.0){
            System.out.println("Exame!");
        }else{
                System.out.println("Retido!");
            }
        }
    }
    
}
