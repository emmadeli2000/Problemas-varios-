import javax.swing.*;
;
public class factorial {
    public static void main(String[] args) {
        int resultado=1;
        int numero= Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));

        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El resultado de factorizar al numero "+numero+" es "+resultado);
        
    }//video 24

    
}
