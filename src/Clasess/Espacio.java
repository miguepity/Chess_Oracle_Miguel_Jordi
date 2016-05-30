/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasess;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Espacio {
    int x;
    int y;
    Pieza pieza;

    public Espacio(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        pieza = null;
    }

    public void occupySpot(Pieza pieza){
        if(this.pieza != null)
            this.pieza.setAvailable(false);
        this.pieza = pieza;
    }

    public boolean isOccupied() {
        if(pieza != null)
            return true;
        return false;
    }

    public Pieza releaseSpot() {
        Pieza releasedPiece = this.pieza;
        this.pieza = null;
        return releasedPiece;
    }

}
