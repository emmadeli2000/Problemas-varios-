import javax.swing.*;
public class comprueba_mail {
    public static void main(String[] args) {
        boolean arroba= false;
        String mail=JOptionPane.showInputDialog("ingrse un e-mail valido ");
         
        for(int i=0;i<mail.length();i++){

            if (mail.charAt(i)=='@') {

                arroba=true;
               
            }
}           
            if(arroba==true){
                System.out.println("es correcto ");
            }
            else{
                System.out.println("es incorrecto ");
            }

}

}
