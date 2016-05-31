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
public class Raiz {
    public String[][] matriz_movimiento=new String[8][8];
    public String pieza;

    public Raiz(String pieza,String[][] matriz_movimiento) {
        this.pieza = pieza;
        this.matriz_movimiento= matriz_movimiento;
    }

    public String[][] getMatriz_movimiento() {
        return matriz_movimiento;
    }

    public void setMatriz_movimiento(String[][] matriz_movimiento) {
        this.matriz_movimiento = matriz_movimiento;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Raiz{" + "matriz_movimiento=" + matriz_movimiento + ", pieza=" + pieza + '}';
    }
    
    
}
