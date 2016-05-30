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
public class Tablero {
private Espacio[][] espacio = new Espacio[8][8];

    public Tablero() {
        super();
        for(int i=0; i<espacio.length; i++){
            for(int j=0; j<espacio.length; j++){
                this.espacio[i][j] = new Espacio(i, j);
            }
        }
    }

    public Espacio getespacio(int x, int y) {
        return espacio[x][y];
    }
}
