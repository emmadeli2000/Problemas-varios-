public class EjemploArray2D {
    public static void main(String[] args) {
        double acumulado;
        double interes=0.1;

        double [][]saldo= new double[6][5];

        for(int i=0;i<6;i++){
            saldo[i][0]=10000;
            acumulado=10000;
            for(int j=1;j<5;j++){
                acumulado=acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;

            }
            interes=interes+0.1;
        }
        for(int k=0;k<6;k++){
            System.out.println();
            for(int z=0;z<5;z++){
                System.out.printf("%1.2f",saldo[k][z]);
                
                System.out.println("");
                
            }
        }
        
    }
    
}
