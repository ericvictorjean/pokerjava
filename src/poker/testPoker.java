/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ERICVICTORJEAN
 */
public class testPoker {
    public static void main(String[] args) {
        baraja baraja1=new baraja();
        for(int i=0;i<52;i++){
            Carta carta= baraja1.getCarta(i);
            System.out.println(carta.toString()+"");
        }
    }
}
