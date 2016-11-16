
package boletin10_1;

import javax.swing.JOptionPane;

public class Juego {
    int num;
    int num2;
    public void poNum(){
    num = Integer.parseInt(JOptionPane.showInputDialog("Número a adivinar "));   
    while (num<1 || num>50){
        num = Integer.parseInt(JOptionPane.showInputDialog("Número a adivinar (entre 1 y 50) "));
    }
}
    int retry = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos "));
    public void adNum(){
        for (int i=1;i<=retry;i++){
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número "));
            if (num2<1 || num2>50)
                System.out.println("Introduce un número (entre 1 y 50) ");
            if (num2 < num)
                System.out.println("Es mayor ");
            if (num2 > num)
                System.out.println("Es menor ");
        }   
        if (num2 == num)        
        System.out.println("Has acertado! ");
        else
        System.out.println("Has fallado! ");
       
                
        }
        }
    

    