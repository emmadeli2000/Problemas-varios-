package poo;

import javax.swing.plaf.TreeUI;

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
    public void setcolor (String dime_color){//setter
        color=dime_color;
    }
    public String getcolor(){//getter
        return color;
    }
    public void configura_asientos(String asientos_cuero){//setter
        if(asientos_cuero.equalsIgnoreCase("si")){
        this.asientos_cuero=true;}// this hace enfacis en recalcar que es la variable original no el atributo del metodo
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
    public void configura_climatizador(String climatizador){//setter
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;

        }else{ this.climatizador=false;}
    }
    public String dime_climatizado(){
        if (climatizador==true){
            return "el vehiculo posee climatizador";
        }else{ return"el vehiculo posee aire de serie";}
        
    }
    public String dime_peso_coche(){//se le ingresan datos y devuelve datos SETTER GETTER
        int peso_carroceria=500;
        peso_total=peso_carroceria+peso_plataforma;
        if (asientos_cuero==true){
            peso_total=peso_total+50;
        }
        if (climatizador==true){
        peso_total=peso_total+20;
        }
        return" El peso total del vehiculo es "+peso_total+" kg";

    }
    public int precio_coche(){//getters
        int precio_final=1000;
        if (asientos_cuero==true){
            precio_final+=2000;
        }
        if (climatizador==true){
            precio_final+=1500;
        } return precio_final;

        
    }



    
}
