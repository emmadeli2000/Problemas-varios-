import javax.swing.*;
import java.util.*;
public class Area {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Elija una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Circulo");
            int figura= entrada.nextInt();
            switch (figura) {
                case 1:
                    int lado=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del lado en centimetros "));
                    System.out.println("el valor del area es "+Math.pow(lado,2)+" cm");
                    break;
                case 2:
                       int base=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base en centimetros "));
                       int altura=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la altura en centimetros "));
                    System.out.println("El valor del area es "+base*altura);
                    break;
                case 3:
                         base=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base en centimetros "));
                         altura=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la altura en centimetros "));
                         System.out.println("El valor del area es "+(base*altura)/2);
                         break;
                case 4:
                     int radio= Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del radio en centimetros "));
                    System.out.print("El valor del area del circulo es ");
                    System.out.println(Math.PI*(Math.pow(radio, 2)));
                    break;
                    default:
                    System.out.println("la opcion no esta contemplada ");

            }
        } 
        }



    }

