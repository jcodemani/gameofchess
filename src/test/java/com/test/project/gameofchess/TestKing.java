package com.test.project.gameofchess;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Test King
 * @author Manasi Apte
 *
 */
public class TestKing extends TestCase {
	
	public TestKing(String testName) {
		super( testName );
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestKing.class); 
    }
    
	/**
     * Test King for position D5
	 * @throws InvalidInputException 
    */
    public void testKing() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("D5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("King");
    	String kingMoves = piece.getPossibleMoves(chessInput);
    	
    	assertTrue(kingMoves.contains("D6"));
    	assertTrue(kingMoves.contains("E6"));
    	assertTrue(kingMoves.contains("E5"));
    	assertTrue(kingMoves.contains("E4"));
    	assertTrue(kingMoves.contains("D4"));
    	assertTrue(kingMoves.contains("C4"));
    	assertTrue(kingMoves.contains("C5"));
    	assertTrue(kingMoves.contains("C6"));
    	
    	String[] splits = kingMoves.split(",");
    	assertEquals(splits.length, 8);
    }
    

	/**
     * Test King for position A8
	 * @throws InvalidInputException 
    */
    public void testKingEdge() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("A8");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("King");
    	String kingMoves = piece.getPossibleMoves(chessInput);
    	
    	assertTrue(kingMoves.contains("B7"));
    	assertTrue(kingMoves.contains("A7"));
    	assertTrue(kingMoves.contains("B8"));
    	
    	String[] splits = kingMoves.split(",");
    	assertEquals(splits.length, 3);
    }
    
    /**
     * Test Invalid position
     * @throws Exception 
    */
    public void testInvalid() throws Exception {    	
    	try {
			GameOfChess.validateInput("King Q10");
		} catch (InvalidInputException e) {
			assertTrue(true);
		}
    }
    
    /**
     * Test Invalid input
     * @throws Exception 
    */
    public void testInvalidInput() throws Exception {    	
    	try {
			GameOfChess.validateInput(null);
		} catch (Exception e) {
			assertTrue(true);
		}
    }

}
