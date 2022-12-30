public class Array_Bidimencional2 {
    
    public static void main(String[] args) {//otra forma de representar la matriz de dos dimensiones y de 20 elementos 
        int [][] matrix2={
            {64,34,36,57,93},
            {86,51,16,10,55},
            {23,59,40,92,40},
            {63,12,94,16,17}
    };
        for(int[]fila:matrix2){
            System.out.println(" ");
            for(int z:fila){
                System.out.print(z+" ");
            } // usando el bucle for each
        }

    }
}
