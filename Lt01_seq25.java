/*Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
Programadora:   Débora Oliveira
Data:       12/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq25 {
    public static void main(String args[]){
        int hI, hF, mI, mF, duracaoH, duracaoM;
        hI = Integer.parseInt(JOptionPane.showInputDialog
                                               ("Digite Hora Inicial do jogo"));
        mI = Integer.parseInt(JOptionPane.showInputDialog
                                             ("Digite Minuto Inicial do jogo"));
        hF = Integer.parseInt(JOptionPane.showInputDialog
                                                 ("Digite Hora Final do jogo"));
        mF = Integer.parseInt(JOptionPane.showInputDialog
                                               ("Digite Minuto Final do jogo"));
        if (hI<=24 && hF<=24 && mI<=60 && mF<=60){
            if (hI<hF && mI<mF ){
                duracaoH = hF-hI;
                duracaoM = mF-mI ;
                System.out.println("O jogo durou "+ duracaoH + ":"+duracaoM);
            }else{
                if (hI>hF && mI<mF){
                    duracaoH = (24-hI)+ hF;
                    duracaoM = mF-mI;
                    System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                }else{
                    if (hI>hF && mI>mF){
                        duracaoH = (24-hI)+hF;
                        duracaoM = (60-mI)+mF;
                        System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                    }else{
                        if (hI<hF && mI>mF){
                            duracaoH = hF-hI;
                            duracaoM = (60-mI)+mF;
                            System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                        }else{
                            if (hI==hF  && mI==mF){
                                duracaoH = hF-hI;
                                duracaoM = mF-mI;
                                System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                            }else{
                                if (hI==hF && mI>mF){
                                    duracaoH = hF-hI;
                                    duracaoM =(60-mI)+mF;
                                    System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                                }else{
                                    if (hI==hF && mI<mF){
                                        duracaoH = hF-hI;
                                        duracaoM = mF-mI;
                                        System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                                    }else{
                                        if (hI<hF && mI==mF){
                                            duracaoH = hF-hI;
                                            duracaoM = mF-mI;
                                            System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                                        }else{
                                            if (hI>hF && mI==mF){
                                                duracaoH = (24-hI)+hF;
                                                duracaoM = mF-mI;
                                                System.out.println
                                     ("O jogo durou "+ duracaoH + ":"+duracaoM);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("Valor digitado inválido");
        }
        
    }
    
}
