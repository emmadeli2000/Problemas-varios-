public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Paco");
        Empleado empleado2= new Empleado("Ana");
            empleado1.cambiaSeccion("recursos humanos ");
        System.out.println(empleado1.dimeDatos()+"\n"+ empleado2.dimeDatos());
        System.out.println(Empleado.dimeIDsiguiente());
        
    }
     static class Empleado{ //tuve que llamarla static para poder usar el objeto en el main en el curso no lo dice 
       private final String Nombre; // final para hacer la palabra nombre una constante en el constructor 
        private String Seccion;
        private int id;// es una variable de clase
        private static int idSiguente=1; 

        
        
       public  Empleado(String nom){
            Nombre=nom;
            Seccion="Administracion";
            id=idSiguente;
            idSiguente++;

             

        }
        public void cambiaSeccion(String Seccion){
            this.Seccion=Seccion;
        }
        public String dimeDatos(){
            return "El nombre del empleado es: "+Nombre+" y la seccion en la que trabaja es: "+Seccion+ " y su ID es "+id; 
        }
        public static String dimeIDsiguiente(){
            return "el ID siguente es "+idSiguente;
         }
    }
} //video 41
