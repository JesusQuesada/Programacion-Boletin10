    
package boletin10_1;

import javax.swing.JOptionPane;

public class Juego {
    int num2;
    int num = Integer.parseInt(JOptionPane.showInputDialog("Número a adivinar "));
    int retry = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos "));
    public void poNum(){
    while (num<1 || num>50){
        num = Integer.parseInt(JOptionPane.showInputDialog("Número a adivinar (entre 1 y 50) "));
    }
}
    
    public void adNum(){
        for(int i=1;i<=retry;i++){
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
            if (num2<1 || num2>50){
                System.out.println("Introduce un número (entre 1 y 50) ");
            }
            else if (num2 < num){
                System.out.println("Es mayor ");
            }
            else if (num2 > num){
                System.out.println("Es menor ");
            }
            else if (num2 == num){
                System.out.println("Has acertado! ");
                break;
            }
        }
        if (num2 != num){
                System.out.println("Has fallado! ");
            }
    }
}

        
         
    
        
    

    