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
    	ChessPosition chessInput = ChessPosition.populateChessInput("E3");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("Horse");
    	String horse = piece.getPossibleMoves(chessInput);

    	assertTrue(horse.contains("D5"));
    	assertTrue(horse.contains("F5"));
    	assertTrue(horse.contains("G4"));
    	assertTrue(horse.contains("G2"));
    	assertTrue(horse.contains("F1"));
    	assertTrue(horse.contains("D1"));
    	assertTrue(horse.contains("C2"));
    	assertTrue(horse.contains("C4"));
    	
    	String[] splits = horse.split(",");
    	assertEquals(splits.length, 8);
    }
}
