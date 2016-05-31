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
public class NodoArbol {
    ListaPiezas pieza;
    String[][] matriz_movimiento = new String[8][8];
    NodoArbol hermano;
    NodoArbol hijo;

    public NodoArbol() {
    }

    
    public NodoArbol(String[][] matriz_movimiento,ListaPiezas pieza) {
        this.pieza = pieza;
        hermano = null;
        hijo = null;
    }

    public ListaPiezas getPieza() {
        return pieza;
    }

    public void setPieza(ListaPiezas pieza) {
        this.pieza = pieza;
    }

    public String[][] getMatriz_movimiento() {
        return matriz_movimiento;
    }

    public void setMatriz_movimiento(String[][] matriz_movimiento) {
        this.matriz_movimiento = matriz_movimiento;
    }

    public NodoArbol getHermano() {
        return hermano;
    }

    public void setHermano(NodoArbol hermano) {
        this.hermano = hermano;
    }

    public NodoArbol getHijo() {
        return hijo;
    }

    public void setHijo(NodoArbol hijo) {
        this.hijo = hijo;
    }

    @Override
    public String toString() {
        return "NodoArbol{matriz_movimiento=" + matriz_movimiento + ", hermano=" + hermano + ", hijo=" + hijo + '}';
    }

    

    
    
}
