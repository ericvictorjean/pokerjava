/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ERICVICTORJEAN
 */
public class Poker {
    int numPartidas;
    Jugador turno;
    baraja Baraja;
    Jugador[] jugadores;
    boolean fase;
    public Poker(){
        this.jugadores=new Jugador[4];
        for(int i=0;i<4;i++){
            this.jugadores[i]= new Jugador(0);
        }
        this.Baraja= new baraja();
        
    }
    public Jugador Jugar(){
        Jugador ganador;
        this.barajar();
        this.repartir();
        this.descartar();
        this.repartir();
        ganador= this.calcularGanador();
        
        return ganador;
    }
}
