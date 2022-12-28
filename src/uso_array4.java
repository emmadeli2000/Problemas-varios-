public class uso_array4 {
    public static void main(String[] args) {
        //rellenar un array con numeros aleatorios 
        int [] numeros_aleatorios=new int[100];
        for(int i=0;i<numeros_aleatorios.length;i++){
            numeros_aleatorios[i]=(int)Math.round(Math.random()*100);
        }
        for (int numeros : numeros_aleatorios) {
            System.out.print(numeros+",");
            
        }
    }
    
}
