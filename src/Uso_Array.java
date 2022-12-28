public class Uso_Array {
    public static void main(String[] args) {
      
      /*  int [] array_1=new int[5]; // es una forma de expresar arays

        array_1[0]=1;
        array_1[1]=2;
        array_1[2]=3;
        array_1[3]=4;
        array_1[4]=5;
        System.out.println(array_1[2]); */

        int [] array_2={1,2,3,4,5,6,7,8,9,10};
      
        for(int i=0;i<array_2.length;i++){
            System.out.println("para el array de indice "+i+" el valor es "+array_2[i] );
        } /*el uso de la palabra  reservada length despues del nombre del array cumple la misma funcion que 
        en los objetos de tipo String devolviendo un int e indicando la longitud total del array*/
    
    }

}
