import javax.swing.*;
public class uso_array3 {
    public static void main(String[] args) {
        String [] provincias=new String[5];
        for(int i=0;i<provincias.length;i++){
            provincias[i]=JOptionPane.showInputDialog("introduzca las provincias "+(i+1));
        }/*  este array nos va amostrar una ventana de dialogo que nos va apermitir ingresar datos de uno en uno 
        hasta completar el array */
        for (String localidad: provincias) {
            System.out.println(localidad);// uso del bucle for each para recorrer el array 
            
        }
    }
}
