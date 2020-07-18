import javax.swing.JOptionPane;
public class Recursiva1 {
    public static void main(String[] args){
        int n=1;
        JOptionPane.showMessageDialog(null, Recursiva1(n));
    }
    static int Recursiva1(int num){
        if(num<100){
            num=num+Recursiva1(num+1);
        }
        return num;
    }
}
