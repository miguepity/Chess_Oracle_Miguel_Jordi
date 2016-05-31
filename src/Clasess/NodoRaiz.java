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
public class NodoRaiz {
    NodoRaiz next;    
    String[][] mapeo;
    String piezas;
    NodoRaiz hermano;
    NodoRaiz hijo;

    public NodoRaiz(String[][] mapeo, String pieza) {
        mapeo = mapeo;
        piezas = pieza;
        hermano = null;
        hijo = null;
        next = null;
    }

    public String[][] getMapeo() {
        return mapeo;
    }

    public void setMapeo(String[][] mapeo) {
        this.mapeo = mapeo;
    }

    public String getPiezas() {
        return piezas;
    }

    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    public NodoRaiz getHermano() {
        return hermano;
    }

    public void setHermano(NodoRaiz hermano) {
        this.hermano = hermano;
    }

    public NodoRaiz getHijo() {
        return hijo;
    }

    public void setHijo(NodoRaiz hijo) {
        this.hijo = hijo;
    }

    public NodoRaiz getNext() {
        return next;
    }

    public void setNext(NodoRaiz next) {
        this.next = next;
    }

    public void imprimir_mapeo(String[][]mapeo){
        for (int i = 0; i < mapeo.length; i++) {
            for (int j = 0; j < mapeo.length-1; j++) {
                System.out.println("[ "+mapeo[i][j]+" ]");
            }
            System.out.println();
        }
    }
}
