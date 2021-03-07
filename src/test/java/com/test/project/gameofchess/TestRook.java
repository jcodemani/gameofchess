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
    	System.out.println(rookMoves);
    }
}
