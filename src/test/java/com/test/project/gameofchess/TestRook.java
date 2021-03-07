package com.test.project.gameofchess;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test Rook
 * @author Manasi Apte
 *
 */
public class TestRook extends TestCase {

	public TestRook(String testName) {
		super( testName );
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestRook.class); 
    }
    
    /**
     * Test Rook positions
	 * @throws InvalidInputException 
    */
    public void testRookPostions() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("B5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Rook");
    	String rookMoves = piece.getPossibleMoves(chessInput);
    	assertTrue(rookMoves.contains("A5"));
    	assertTrue(rookMoves.contains("C5"));
    	assertTrue(rookMoves.contains("D5"));
    	assertTrue(rookMoves.contains("E5"));
    	assertTrue(rookMoves.contains("F5"));
    	assertTrue(rookMoves.contains("G5"));
    	assertTrue(rookMoves.contains("H5"));
    	
    	assertTrue(rookMoves.contains("B4"));
    	assertTrue(rookMoves.contains("B3"));
    	assertTrue(rookMoves.contains("B2"));
    	assertTrue(rookMoves.contains("B1"));
    	
    	assertTrue(rookMoves.contains("B6"));
    	assertTrue(rookMoves.contains("B7"));
    	assertTrue(rookMoves.contains("B8"));
    	
    	String[] splits = rookMoves.split(",");
    	assertEquals(splits.length, 14);
    }
}
