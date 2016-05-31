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
public class ListaPiezas {
    private NodoPiezas head;
    private int tamano;

    public ListaPiezas() {
        this.tamano = 0;
        this.head = null;
    }

    public NodoPiezas getHead() {
        return head;
    }

    public void setHead(NodoPiezas head) {
        this.head = head;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public void insert(NodoPiezas nodo, int pos) {
        NodoPiezas newNodo= new NodoPiezas(nodo.getPieza());
        NodoPiezas newHead = head;
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
        NodoPiezas n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void borrar(int pos) {
        NodoPiezas temp = head;
        NodoPiezas temp2 = temp.getNext();//siguiente
        if (pos == 0) {
            this.setHead(temp2);
            tamano--;
        } else {
            for (int i = 1; i < pos ; i++) {
                temp = temp.getNext();
            }
            NodoPiezas temp3 = temp.getNext();
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

    public NodoPiezas get(int Posicion) {
        if (tamano == 0) {
            return null;
        } else if (tamano == Posicion) {
            return head.next;
        } else {
            NodoPiezas tmp = head;
            for (int i = 0; i < Posicion; i++) {
                tmp = tmp.getNext();
            }
            return tmp.next;
        }
    }
}


