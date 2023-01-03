package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche renault= new Coche();
        renault.setcolor("rojo");
        System.out.println("el color del coche es "+renault.getcolor() );
        System.out.println(renault.dime_datos_generales());
        
    }
    
}
//video clase 30