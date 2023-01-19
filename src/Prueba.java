public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Paco");
        Empleado empleado2= new Empleado("Ana");
            empleado1.cambiaSeccion("recursos humanos ");
        System.out.println(empleado1.dimeDatos());
        System.out.println(empleado2.dimeDatos());
        
    }
     static class Empleado{ //tuve que llamarla static para poder usar el objeto en el main en el curso no lo dice 
       private final String Nombre; // final para hacer la palabra nombre una constante en el constructor 
        String Seccion;
        
       public  Empleado(String nom){
            Nombre=nom;
            Seccion="Administracion";


        }
        public void cambiaSeccion(String Seccion){
            this.Seccion=Seccion;
        }
        public String dimeDatos(){
            return "El nombre del empleado es: "+Nombre+" y la seccion en la que trabaja es: "+Seccion;
        }
    }
}
