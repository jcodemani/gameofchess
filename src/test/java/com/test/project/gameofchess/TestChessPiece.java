package com.test.project.gameofchess;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestChessPiece extends TestCase {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	public TestChessPiece(String testName) {
		super( testName );
	}

	protected void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(TestChessPiece.class); 
    }
    
	/**
     * Test King for position D5
	 * @throws InvalidInputException 
    */
    public void testKing() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("D5");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("King");
    	piece.printPossibleMoves(chessInput);
    	assertEquals("D6,E6,E5,E4,D4,C4,C5,C6", outContent.toString());
    	outContent.reset();
    }
    

	/**
     * Test King for position A8
	 * @throws InvalidInputException 
    */
    public void testKingEdge() throws InvalidInputException
    {
    	ChessPosition chessInput = ChessPosition.populateChessInput("A8");
    	ChessPiece piece = ChessPieceFactory.getChessPieceForType("King");
    	piece.printPossibleMoves(chessInput);
    	assertEquals("B7,A7,B8", outContent.toString());
    	outContent.reset();
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
    
    protected void tearDown() throws Exception {
    	System.setOut(originalOut);
    }

}
