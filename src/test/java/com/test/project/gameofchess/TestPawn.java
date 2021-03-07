package com.test.project.gameofchess;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test Pawn
 * @author Manasi Apte
 *
 */
public class TestPawn extends TestCase {
	
	public TestPawn(String testName) {
		super( testName );
	}

	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestPawn.class); 
    }
    
    /**
     * Test Pawn position
	 * @throws InvalidInputException 
    */
    public void testPawnPostion() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("B5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Pawn");
    	String pawnMoves = piece.getPossibleMoves(chessInput);
    	
    	assertEquals(pawnMoves, "B6");
    }

    /**
     * Test Pawn topmost position
	 * @throws InvalidInputException 
    */
    public void testPawn() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("B8");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Pawn");
    	String pawnMoves = piece.getPossibleMoves(chessInput);
    	assertTrue(pawnMoves.isEmpty());    	
    }
}
