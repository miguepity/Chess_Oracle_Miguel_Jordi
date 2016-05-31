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
public class Rey extends Pieza{
    
     public Rey(boolean available, int x, int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(String [][] matrix, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(matrix, fromX, fromY, toX, toY) == false)
            return false;
        if(Math.sqrt(Math.pow(Math.abs((toX - fromX)),2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)){
            return false;
        }
        return false;
    }
}
