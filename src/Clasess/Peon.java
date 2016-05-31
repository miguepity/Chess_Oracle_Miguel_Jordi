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
public class Peon extends Pieza {

    public Peon(boolean available, int x, int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(String[][] matrix, int fromX, int fromY, int toX, int toY) {
        if (super.isValid(matrix, fromX, fromY, toX, toY) == false) {
            return false;
        }

        if (fromX > toX) {
            return false;
        }

        if (toX > fromX) {
            return false;
        }

        if (fromY == toY) {
            //Not taking a piece
            if (matrix[fromX + 1][fromY] != null) {
                return false;
            }

            if (matrix[fromX - 1][fromY] != null) {
                return false;

            }

            if (Math.abs(toX - fromX) > 2) {
                return false;
            } else if (Math.abs(toX - fromX) == 2) {

                if (matrix[fromX + 2][fromY] != null) {
                    return false;
                }

                if (matrix[fromX - 2][fromY] != null) {
                    return false;
                }

                //En passante
                if (toY + 1 < 8) {
                    if (matrix[toX][toY + 1] != null) {
                        if (matrix[toX][toY + 1]==null) {
                            available = true;
                        }
                    }
                } else if (toY - 1 > 0) {
                    if (matrix[toX][toY - 1] != null) {
                        if (matrix[toX][toY - 1]==null) {
                            available = true;
                        }
                    }
                }

            }
        } else {
            //Taking a piece
            if (Math.abs(toY - fromY) != 1 || Math.abs(toX - fromX) != 1) {
                return false;
            }

            if (matrix[toX][toY] == null) {
                /*if(newRow - 1 > 0){
                 if(newCol - 1 > 0){
                 if(board[newRow - 1][newCol - 1] != null){
                 if(){

                 }
                 }
                 }
                 }*/
                return false;
            }
        }

        return true;
    }
}
3