package poo;
import javax.swing.*;
public class Uso_Coche {
    public static void main(String[] args) {
        Coche renault= new Coche();
        renault.setcolor(JOptionPane.showInputDialog("introduzca un color "));
        System.out.println("el color del coche es "+renault.getcolor() );
        System.out.println(renault.dime_datos_generales());
        renault.configura_asientos(JOptionPane.showInputDialog("asientos de cuero si o no"));
        System.out.println(renault.dime_asientos());
        renault.configura_climatizador(JOptionPane.showInputDialog("climatizador si o no"));
        System.out.println("el auto posee"+renault.dime_climatizado());
       System.out.println("el peso total del vehiculo es "+renault.dime_peso_coche()+" kg");
        System.out.println("el precio del coche es de $ "+renault.precio_coche());
    }
}
    


