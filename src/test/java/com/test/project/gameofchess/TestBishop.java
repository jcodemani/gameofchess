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
    	System.out.println(bishop);
    }
}
