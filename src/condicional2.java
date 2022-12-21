
import java.util.*;
public class condicional2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("ingrese su edad por favor ");

        int edad=entrada.nextInt();
        if (edad<18){
            System.out.println("eres adolecente");
            
        } else if (edad<40) {
            System.out.println("eres joven");
            
        } else if (edad<65) {
            System.out.println("eres una persona madura");
            
        } else  {
            System.out.println("Cuidate ");
            
        }
    }
}
