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
    NodoRaiz raiz;

    public Arbol(NodoRaiz raizd) {
        raiz=raizd;
    }
    void insertar(NodoRaiz padre, NodoRaiz hijo,int pos) {
        ListaRaiz p = new ListaRaiz();//direccion de memoria
        p.insert(raiz,pos);
        //Buscar(raiz, p, padre);
        if (p.get(0) != null) {
            NodoRaiz x = hijo;
            if (p.get(0).hijo == null) {
                p.get(0).hijo = x;
            } else {
                p.insert(p.get(0).hijo, 0);
                while (p.get(0).hermano != null) {
                    p.insert(p.get(0).hermano, 0);
                }
                p.get(0).hermano = x;
            }
        } else {
            NodoRaiz aux = raiz;
            while (aux.hermano != null) {
                aux = aux.hermano;
            }
            NodoRaiz pa = new NodoRaiz(padre.getMapeo(),padre.getPiezas());
            NodoRaiz hi = new NodoRaiz(hijo.getMapeo(),hijo.getPiezas());
            pa.hijo = hi;
            aux.hermano = pa;
        }
    }

//    void Buscar(Raiz padre, Raiz[] puntero, int n) {
//        if (padre != null) {
//            if (padre.info == n) {
//                puntero[0] = padre;
//                return;
//            }
//            Buscar(padre.hijo, puntero, n);
//            Buscar(padre.hermano, puntero, n);
//        }
//    }

    int profundidad(NodoRaiz r) {
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

    void Niveles(NodoRaiz x, int c, int n) {
        if (x != null) {
            if (c == n) {
                x.getMapeo();
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
    
    public static void mostrarin(NodoRaiz padre) {
        if (padre != null) {
            mostrarin(padre.hijo);
            imprimir_mapeo(padre.getMapeo());
            mostrarin(padre.hermano);
        }
    }
    public static void imprimir_mapeo(String[][]mapeo){
        for (int i = 0; i < mapeo.length; i++) {
            for (int j = 0; j < mapeo.length-1; j++) {
                System.out.println("[ "+mapeo[i][j]+" ]");
            }
            System.out.println();
        }
    }
}
