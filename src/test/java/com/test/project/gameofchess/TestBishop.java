package com.test.project.gameofchess;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test Bishop
 * @author apte
 *
 */
public class TestBishop extends TestCase {

	public TestBishop(String testName) {
		super( testName );
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestBishop.class); 
    }
    
    /**
     * Test Bishop positions
	 * @throws InvalidInputException 
    */
    public void testBishopPostions() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("B5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Bishop");
    	String bishop = piece.getPossibleMoves(chessInput);
    	
    	assertTrue(bishop.contains("A4"));
    	assertTrue(bishop.contains("A6"));
    	assertTrue(bishop.contains("C6"));
    	assertTrue(bishop.contains("D7"));
    	assertTrue(bishop.contains("D3"));
    	assertTrue(bishop.contains("C4"));
    	assertTrue(bishop.contains("E2"));
    	assertTrue(bishop.contains("F1"));
    	assertTrue(bishop.contains("E8"));
    	
    	String[] splits = bishop.split(",");
    	assertEquals(splits.length, 9);
    }
}
