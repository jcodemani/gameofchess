package com.test.project.gameofchess;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test Horse
 * @author apte
 *
 */
public class TestHorse extends TestCase {

	public TestHorse(String testName) {
		super( testName );
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestHorse.class); 
    }
    
    /**
     * Test Horse positions
	 * @throws InvalidInputException 
    */
    public void testHorsePostions() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("B5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Horse");
    	String horse = piece.getPossibleMoves(chessInput);
    	System.out.println(horse);
    }
}
