public class uso_array2 {
    public static void main(String[] args) {
        String[] paises=new String[5];

        paises[0]="Argentina";
        paises[1]="España";
        paises[2]="Portugal";
        paises[3]="Finlandia";
        paises[4]="Dinamarca";

       /*  for(int i=0;i<paises.length;i++){
            System.out.println("para la pocicion "+i+" del array paises corresponde "+paises[i]);
        }*/
        for (String cualquier_nombre : paises) {
            System.out.println(cualquier_nombre); /*buche for each secrea una variable del mismo tipo que el array que puede tener cualquier nombre 
            y despues de los dos puntos el nombre del array que debe recorrer, para imprimirlo basta con poner el nombre de la variable 
            recientemente creada*/

            
        }
    
    }

    
}
