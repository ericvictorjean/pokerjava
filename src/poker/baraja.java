/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ERICVICTORJEAN
 */
public class baraja {
    Carta[] numcartas= new Carta[52];
    public baraja(){
        Carta carta=new Carta(1,1);
        int num=1;
        int palo=1;
        for(int i=0;i<52;i++){
            numcartas[i]=carta;
            num++;
            carta= new Carta(palo,num);
            if(i==12 ||i==25 || i==38){
                num=1;
                palo++;
                carta= new Carta(palo,num);
            }
        }
    }
    public Carta getCarta(int i){
        return this.numcartas[i];
    }
    public Carta repartir(int numrepartir){
        Carta reparto[]=new Carta[5];
        for(int i=0;i<numrepartir;i++){
            reparto[i]=this.numcartas[i];
            return reparto[i];
        }
    }
}
