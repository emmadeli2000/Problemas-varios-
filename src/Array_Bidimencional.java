public class Array_Bidimencional {
    public static void main(String[] args) {
        int [][] matrix=new int[4][5];

       matrix[0][0]=64;
       matrix[0][1]=34;
       matrix[0][2]=36;
       matrix[0][3]=57;
       matrix[0][4]=93;

       matrix[1][0]=86;
       matrix[1][1]=51;
       matrix[1][2]=16;
       matrix[1][3]=10;
       matrix[1][4]=55;

       matrix[2][0]=23;
       matrix[2][1]=59;
       matrix[2][2]=40;
       matrix[2][3]=92;
       matrix[2][4]=40;

       matrix[3][0]=63;
       matrix[3][1]=12;
       matrix[3][2]=94;
       matrix[3][3]=16;
       matrix[3][4]=17;

       for(int i=0;i<4;i++){
        System.out.println();// se deja una linea vacia para que ciando salte de una pocicion a otra no esten todos los numeros juntos 
        for(int z=0;z<5;z++){
            System.out.print(matrix[i][z]+" ");//se deja un espacio vacio para que no esten pegados los numeros 
        }//al resultado final se ve como una tabla 
       }
       
        
        
        
       }

    }
    

