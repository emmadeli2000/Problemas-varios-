import java.util.Scanner;
public class Condicional1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("ingrese su edad por favor ");

            int edad=entrada.nextInt();

            if(edad>=18){
                System.out.println("eres mayor de edad estas apto para votar ");

            }else {
                System.out.println("no estas encondicion de votar por ser menor de edad ");
            }
        }


    }
}
