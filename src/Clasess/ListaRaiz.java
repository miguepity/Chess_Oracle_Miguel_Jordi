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
public class ListaRaiz {

    private NodoRaiz head;
    private int tamano;

    public ListaRaiz() {
        this.tamano = 0;
        this.head = null;
    }

    public NodoRaiz getHead() {
        return head;
    }

    public void setHead(NodoRaiz head) {
        this.head = head;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public void insert(NodoRaiz nodo, int pos) {
        NodoRaiz newNodo= new NodoRaiz(nodo.getMapeo(),nodo.getPiezas());
        NodoRaiz newHead = head;
        int cont = 0;
        if(pos==0){
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext()!=null) {
            newHead =newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        NodoRaiz n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void borrar(int pos) {
        NodoRaiz temp = head;
        NodoRaiz temp2 = temp.getNext();//siguiente
        if (pos == 0) {
            this.setHead(temp2);
            tamano--;
        } else {
            for (int i = 1; i < pos ; i++) {
                temp = temp.getNext();
            }
            NodoRaiz temp3 = temp.getNext();
            temp.setNext(temp3.getNext());
            tamano--;
        }
    }

//    public void Print_Lista() {
//        NodoRaiz temp = head;
//        while (temp != null) {
//            System.out.println(temp.g.toString());
//            temp = temp.next;
//        }
//    }

    public NodoRaiz get(int Posicion) {
        if (tamano == 0) {
            return null;
        } else if (tamano == Posicion) {
            return head.getHijo();
        } else {
            NodoRaiz tmp = head;
            for (int i = 0; i < Posicion; i++) {
                tmp = tmp.getNext();
            }
            return tmp.getHijo();
        }
    }
}
