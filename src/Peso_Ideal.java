import javax.swing.*;
public class Peso_Ideal {
    public static void main(String[] args) {

        String genero="";

        do {
            genero=JOptionPane.showInputDialog("indique su genero H masculino M femenino");
            
        } while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);
        
     
    int altura=Integer.parseInt(JOptionPane.showInputDialog("introduzca su altura en centimetros"));
    
    int Peso_Ideal=0;

    if(genero.equalsIgnoreCase("H")){
        Peso_Ideal=altura-110;
    }else if(genero.equalsIgnoreCase("M")){
        Peso_Ideal=altura-120;
    }
    System.out.println("su peso ideal segun el genero indicado es de "+Peso_Ideal);
}
}
