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
public class Pieza {
    boolean available;
    private int x;
    private int y;

    public Pieza(boolean available, int x, int y) {
        super();
        this.available = available;
        this.x = x;
        this.y = y;
    }


    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean isValid(Tablero tablero, int fromX, int fromY, int toX, int toY){
        if(toX == fromX && toY == fromY)
            return false; //cannot move nothing
        if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
        return true;
    }

}