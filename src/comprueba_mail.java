import javax.swing.*;
public class comprueba_mail {
    public static void main(String[] args) {
        int arroba= 0;
        boolean punto=false;
        String mail=JOptionPane.showInputDialog("ingrse un e-mail valido ");
         
        for(int i=0;i<mail.length();i++){

            if (mail.charAt(i)=='@') {

                arroba++;
               
            }
            if(mail.charAt(i)=='.'){
                punto=true;
            }
}           
            if(arroba==1 && punto==true){
                System.out.println("es correcto ");
            }
            else{
                System.out.println("es incorrecto ");
            }

    }

}// video 22
