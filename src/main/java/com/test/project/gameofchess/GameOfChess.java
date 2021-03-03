package com.test.project.gameofchess;

import java.util.Scanner;

/**
 * Process position of chess piece type on chess board as an 
 * input from STDIN (e.g. "King D5")
 * to print all possible positions applicable to type of chess piece.
 *
 */
public class GameOfChess
{
	// possible rows
	private static final char[] ROWS =  {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	// possible columns
	private static final int COLUMNS = 8;
	
    public static void main( String[] args )
    {
       System.out.println("Please enter chess board position: ");
       Scanner in = new Scanner(System.in);
       String input = null;
       if(in.hasNext()) {
    	   input = in.nextLine();
       }
       in.close();
       
       System.out.println("Echo Input:" + input);
       System.out.println();
       if(input == null || !validateInput(input)) {    	   
    	   System.out.println("Please enter valid input, it should contain Chess piece name followed by valid position e.g. King D5");
       } else {
    	   ChessInputDto chessInput = populateChessInput(input);
       }
    }
    
    /**
     * Validate input obtained from console.
     * @param input
     */
    private static boolean validateInput(String input) {
    	return true;
    }
    
    /**
     * Populate chess board input
     * @param input
     * @return
     */
    private static ChessInputDto populateChessInput(String input) {
    	return null;
    }
}
