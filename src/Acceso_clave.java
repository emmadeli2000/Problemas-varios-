import javax.swing.*;
public class Acceso_clave {
    public static void main(String[] args) {
        String clave="Emmanuel";
        String pass="";

        while (clave.equals(pass)==false) {
            pass=JOptionPane.showInputDialog("Introduce tu contraseña ");

            if (clave.equals(pass)==false) {
                System.out.println("intenta de nuevo ");
                
            }
            
        }
        System.out.println("la clave es correcta ");
        
    }
    
}
