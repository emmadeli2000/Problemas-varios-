import java.util.*;
public class Adivina_Numero {
    public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);
      int aleatorio=(int)(Math.random()*100);
      int numero=0;
      int intentos=0;
      
      while (aleatorio!=numero) {
        System.out.println("introduce un numero del 0 al 100");
        numero=entrada.nextInt();

        if (numero>aleatorio) {
            System.out.println("el numero que buscas es menor al introducido");
            
        }else if (numero<aleatorio){
            System.out.println("el numero que buscas es mayor al introducido");
        }
        intentos++;
            
        } System.out.println("la respuesta es correcta ");
        System.out.println("lo has logrado en "+ intentos+" intentos" );

        
      }

    

}
    

