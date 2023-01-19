public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Paco");
        Empleado empleado2= new Empleado("Ana");
        
    }
     static class Empleado{ //tuve que llamarla static para poder usar el objeto en el main en el curso no lo dice 
        String Nombre;
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
