package com.test.project.gameofchess;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests Queen
 * @author Manasi Apte
 *
 */
public class TestQueen extends TestCase {

	public TestQueen(String testName) {
		super( testName );
	}

	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestQueen.class); 
    }
    
    /**
     * Test Queen positions
	 * @throws InvalidInputException 
    */
    public void testQueenPostion() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("B5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Queen");
    	String queenMoves = piece.getPossibleMoves(chessInput);
    	
    	System.out.println(queenMoves);
    }
}
