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
public class NodoPiezas {
    
    String pieza;
    NodoPiezas next;

    public NodoPiezas() {
    }

    public NodoPiezas(String pieza) {
        this.pieza = pieza;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }
    
        public NodoPiezas getNext() {
        return next;
    }

    public void setNext(NodoPiezas next) {
        this.next = next;
    }
    
}
