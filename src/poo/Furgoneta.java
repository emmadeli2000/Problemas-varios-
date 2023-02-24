package poo;

public class Furgoneta extends Coche{// la palabra reservada extend peromite a la clase furgoneta heredar de la clase coche 
    
    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta (int capacidad_carga, int plazas_extra){
        super();//llama al constructor de la clase padre
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }
    public String Datos_furgoneta (){
        return "posee una capacidad de carga de "+capacidad_carga+" y "+plazas_extra+" plazas ";
    }
    
}
