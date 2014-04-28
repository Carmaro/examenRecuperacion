package Sudoku;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sudoku SUDOKU = new sudoku(9,9);
        
        
        String ver = SUDOKU.toString();
        System.out.println(ver);
        
        boolean acabado =  SUDOKU.isFinished();
        System.out.println(acabado);
        
    }
}
