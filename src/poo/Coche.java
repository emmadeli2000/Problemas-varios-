package poo;
public class Coche {

   private int ruedas;
   private int peso_plataforma;
   private int motor;
   private int largo;
   private int ancho;
  private String color;
   private int peso_total;
   private boolean asientos_cuero,climatizador;


    public Coche(){
     ruedas=4;
     peso_plataforma=500;
     motor=1600;
     largo=2000;
    ancho=300;

    }
    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene  "+ruedas+" ruedas"+" y mide  "+largo/1000+ " metros con un ancho de "+ancho+
        " cm y un peso  de plataforma de "+peso_plataforma+ " kg y posee un motor de "+motor+" cm cubicos";
    }
    public void setcolor (String dime_color){
        color=dime_color;
    }
    public String getcolor(){
        return color;
    }
    public void configura_asientos(String asientos_cuero){
        if(asientos_cuero=="si"){
        this.asientos_cuero=true;}
        else{
            this.asientos_cuero=false;
        }
    }
    public String dime_asientos(){
        if(asientos_cuero==true){
            return "el coche posee asientos de cuero ";
        }else{
            return "el coche tiene asientos  de serie ";
        }
    }
    
}
