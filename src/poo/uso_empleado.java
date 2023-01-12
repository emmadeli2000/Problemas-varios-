package poo;
import java.util.*;
public class uso_empleado {
    public static void main(String[] args) {
       /* empleado empleado1=new empleado("Paco Gomez", 85000, 1990, 12, 17);
        empleado empleado2=new empleado("Ana Lopez", 95000, 1995, 06, 02);
        empleado empleado3=new empleado("Maria Martin", 105000, 2002, 03, 15);
    
    empleado1.subeSueldo(5);
    empleado2.subeSueldo(5);
    empleado3.subeSueldo(5);
    
        System.out.println("Nombre: "+empleado1.dame_nombre()+" Sueldo: "+empleado1.dime_sueldo()+" fecha de alta: "+empleado1.altaFechaContrato());
        System.out.println("Nombre: "+empleado2.dame_nombre()+" Sueldo: "+empleado2.dime_sueldo()+" fecha de alta: "+empleado2.altaFechaContrato());
        System.out.println("Nombre: "+empleado3.dame_nombre()+" Sueldo: "+empleado3.dime_sueldo()+" fecha de alta: "+empleado3.altaFechaContrato());
    */

        empleado[]misEmpleados=new empleado[3];
        misEmpleados[0]=new empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1]=new empleado("Ana Lopez", 95000, 1995, 06, 02);
        misEmpleados[2]=new empleado("Maria Martin", 105000, 2002, 03, 15);

        /*for(int i=0;i>misEmpleados.length;i++){
            misEmpleados[i].subeSueldo(5);
        }
        
        for(int i=0;i>misEmpleados.length;i++){
            System.out.println("Nombre:"+misEmpleados[i].dame_nombre()+" Sueldo "+misEmpleados[i].dime_sueldo()+
            " Fecha de alta: "+misEmpleados[i].altaFechaContrato());
        }*/
        for (empleado e : misEmpleados) {
            e.subeSueldo(5);
            }

            for (empleado x : misEmpleados) {
                System.out.println("Nombre:"+x.dame_nombre()+" Sueldo "+x.dime_sueldo()+
                " Fecha de alta: "+x.altaFechaContrato());

                
            }
    }

    
}
class empleado{

    public empleado(String nom,double sue,int año,int mes,int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);
        altacontrato=calendario.getTime();//gettime heredado

    }
    public String dame_nombre(){
        return nombre;
    }
    public double dime_sueldo(){
        return sueldo;
    }
    public Date altaFechaContrato(){
        return altacontrato;
    }
    public void subeSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;//es como poner sueldo=sueldo+aumento

    }
     private String nombre;
     private double sueldo;
     private Date altacontrato;
}
//en gregorianCalendar eneroes el mes 0, se com¿nstruye al = que la clase scanner