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
public class Arbol {

    NodoArbol raiz;

    public Arbol(NodoArbol raiz) {
        this.raiz = raiz;
    }

    void insertar(NodoArbol padre, NodoArbol hijo,int n,String[][] matriz_movimiento,String pieza) {
        NodoArbol[] p = new NodoArbol[1];//direccion de memoria
        //Buscar(raiz, p, n);
        if (p[0] != null) {
            NodoArbol x = new NodoArbol(matriz_movimiento,pieza);
            if (p[0].hijo == null) {
                p[0].hijo = x;
            } else {
                p[0] = p[0].hijo;
                while (p[0].hermano != null) {
                    p[0] = p[0].hermano;
                }
                p[0].hermano = x;
            }
        } else {
            NodoArbol aux = raiz;
            while (aux.hermano != null) {
                aux = aux.hermano;
            }
            NodoArbol pa = new NodoArbol(matriz_movimiento,pieza);
            NodoArbol hi = new NodoArbol(matriz_movimiento,pieza);
            pa.hijo = hi;
            aux.hermano = pa;
        }
    }

//    void Buscar(NodoArbol padre, NodoArbol[] puntero, int n) {
//        if (padre != null) {
//            if (padre.pieza == n) {
//                puntero[0] = padre;
//                return;
//            }
//            Buscar(padre.hijo, puntero, n);
//            Buscar(padre.hermano, puntero, n);
//        }
//    }

    int profundidad(NodoArbol r) {
        if (r != null) {
            int i = 1, d = 1;
            if (r.hijo == null && r.hermano == null) {
                return 1;
            }
            if (r.hijo != null) {
                i = i + profundidad(r.hijo);
            }
            if (r.hermano != null) {
                d = d + profundidad(r.hermano); //no importa mucho
            }
            return i;
        } else {
            return 0;
        }
    }

    void Niveles(NodoArbol x, int c, int n) {
        if (x != null) {
            if (c == n) {
                System.out.print(x.pieza + " ");
            }
            Niveles(x.hijo, c + 1, n);
            Niveles(x.hermano, c, n);
        }
    }

    void Mos_nivel() {
        int aux = profundidad(raiz);
        for (int i = 1; i <= aux; i++) {
            Niveles(raiz, 1, i);
            System.out.println();
        }
    }
}
