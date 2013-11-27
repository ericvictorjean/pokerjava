/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ERICVICTORJEAN
 */
public class Carta {
    private int palo;
    private int numero;
    
    public Carta(int palo, int numero){
        this.palo=palo;
        this.numero=numero;
    }
    public int Peso(){
        int peso=0;
        return peso;
    }
    public int getpalo() {
        return palo;
    }

    public int getnumero() {
        return numero;
    }

    public void setpalo(int palo) {
        this.palo = palo;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return "Carta: Palo "+ this.palo+" "+"Numero"+" "+this.numero;
    }
}
