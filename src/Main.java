import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String num1= JOptionPane.showInputDialog("ingrese un numero");
        double num2=Double.parseDouble(num1);
        System.out.print("la reaiz cuadrada de "+num2+ " es ");
        System.out.printf("%1.4f",Math.sqrt(num2));
        // a tener en cuenta se ve el uso de la clase Math y de la clase JOptionPane.showInputDialog



    }
}