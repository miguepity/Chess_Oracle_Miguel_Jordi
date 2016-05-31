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
public class Queen extends Pieza{
    
    public Queen(boolean available, int x, int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(String [][] matrix, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(matrix, fromX, fromY, toX, toY) == false)
            return false;
        //diagonal
        if(toX - fromX == toY - fromY)
            return true;
        if(toX == fromX)
            return true;
        if(toY == fromY)
            return true;

        return false;
    }
}
