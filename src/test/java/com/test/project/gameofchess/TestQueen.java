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
    	
    	assertTrue(queenMoves.contains("A5"));
    	assertTrue(queenMoves.contains("C5"));
    	assertTrue(queenMoves.contains("D5"));
    	assertTrue(queenMoves.contains("E5"));
    	assertTrue(queenMoves.contains("F5"));
    	assertTrue(queenMoves.contains("G5"));
    	assertTrue(queenMoves.contains("H5"));
    	
    	assertTrue(queenMoves.contains("B4"));
    	assertTrue(queenMoves.contains("B3"));
    	assertTrue(queenMoves.contains("B2"));
    	assertTrue(queenMoves.contains("B1"));
    	
    	assertTrue(queenMoves.contains("B6"));
    	assertTrue(queenMoves.contains("B7"));
    	assertTrue(queenMoves.contains("B8"));
    	
    	assertTrue(queenMoves.contains("A4"));
    	assertTrue(queenMoves.contains("A6"));
    	assertTrue(queenMoves.contains("C6"));
    	assertTrue(queenMoves.contains("D7"));
    	assertTrue(queenMoves.contains("D3"));
    	assertTrue(queenMoves.contains("C4"));
    	assertTrue(queenMoves.contains("E2"));
    	assertTrue(queenMoves.contains("F1"));
    	assertTrue(queenMoves.contains("E8"));
    	
    	String[] splits = queenMoves.split(",");
    	assertEquals(splits.length, 23 );
    }
}
