/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ERICVICTORJEAN
 */
public class Jugador {
    Carta[] mano=new Carta[5];
    int id;
    int victorias;
    int numdescartadas;
    public Jugador(int id){
        this.id=id;
        this.numdescartadas=0;
        this.victorias=0;
        
    }
    public Carta[] getmano() {
        return mano;
    }

    public int getid() {
        return id;
    }
    
    public int getvictorias() {
        return victorias;
    }
    
    public int getnumdescartadas() {
        return numdescartadas;
    }

    public void setmano(Carta[] mano) {
        this.mano = mano;
    }

    public void setid(int id) {
        this.id = id;
    }
    
    public void setvictorias(int victorias) {
        this.victorias = victorias;
    }
    public void setnumdescartadas(int numdescartadas) {
        this.numdescartadas = numdescartadas;
    }
    public void descartar(int b){
        Carta[] a=getmano();
        setnumdescartadas(b);
        a[numdescartadas]=null;
    }
    public int calcularPuntuacion(){
        int suma=0;
        for(int i=0;i<5;i++){
            suma=suma+mano[i].Peso();
        }
        return suma;
    }
    public String toString(){
        return "Id"+id+"Victorias:"+victorias;
    }
}

