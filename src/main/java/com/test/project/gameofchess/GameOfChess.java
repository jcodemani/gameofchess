package com.test.project.gameofchess;

import java.util.Scanner;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

/**
 * Process position of chess piece type on chess board as an 
 * input from STDIN (e.g. "King D5")
 * to print all possible positions applicable to type of chess piece.
 *
 */
public class GameOfChess {
	
    public static void main( String[] args )
	{
		String input = null;
		try {
			System.out.println("Please enter chess board position: ");
			Scanner in = new Scanner(System.in);

			if (in.hasNext()) {
				input = in.nextLine();
			}
			in.close();

			System.out.println("Echo Input:" + input);
			System.out.println();

			validateInput(input);

			String[] splitInput = input.split(" ");
			ChessPosition chessInput = ChessPosition.populateChessInput(splitInput[1]);
			ChessPiece piece = ChessPieceFactory.getChessPieceForType(splitInput[0]);
			String output = piece.getPossibleMoves(chessInput);
			System.out.print(output);
		} catch (Exception e) {
			System.out.println("Error trying to parse input: " + input + " please enter valid input ");
		}
	}
    
    /**
     * Validate input obtained from console.
     * @param input
     * @throws Exception 
     */
	public static void validateInput(String input) throws Exception {
		try {
			boolean isValidInput = false;
			String[] splitInput = input.split(" ");
			if (splitInput.length == 2) {
				String position = splitInput[1];
				char[] posArr = position.toCharArray();
				if (posArr.length == 2 && ChessPosition.isRowValid(posArr[0])
						&& ChessPosition.isColumnValid(posArr[1])) {
					isValidInput = true;
				}
			}
			if(!isValidInput) {
				throw new InvalidInputException();
			}
		} catch (Exception e) {
			throw e;
		}
	}
    
    
    
    
}
