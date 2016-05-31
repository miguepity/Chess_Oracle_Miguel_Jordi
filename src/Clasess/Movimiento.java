/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasess;

/**
 *
 * @author jordi
 */
public class Movimiento {
    private Tablero[][] tablero = new Tablero[8][8];

    public Movimiento(Tablero tablero[][]) {
        this.tablero=null;
    }

    public Tablero[][] getTablero() {
        return tablero;
    }

    public void setTablero(Tablero[][] tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "tablero=" + tablero + '}';
    }
    
    
    
}
