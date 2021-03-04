package com.test.project.gameofchess.dto;

import java.util.ArrayList;
import java.util.List;

public class ChessPosition {
	
	// possible rows
	private static List<String> ROWS =  new ArrayList<String>(); 
	static {
		ROWS.add("A");
		ROWS.add("B");
		ROWS.add("C");
		ROWS.add("D");
		ROWS.add("E");
		ROWS.add("F");
		ROWS.add("G");
		ROWS.add("H");
	}
	// possible columns
	public static final int COLUMNS = 8;

	int position;
	String currRow;

	public ChessPosition(int position, String currRow) {
		super();
		this.position = position;
		this.currRow = currRow;
	}
	
	public int getPosition() {
		return position;
	}
	
	public String getCurrRow() {
		return currRow;
	}
	
	/**
     * Check if row character is valid
     * @param row
     * @return
     */
    public static boolean isRowValid(char row) {
    	return ROWS.contains(row + "");
    }
    
    /**
     * Checks if column number is valid
     * @param position
     * @return
     */
    public static boolean isColumnValid(char position) {
    	boolean isValid = false;
    	Integer column = new Integer(position + "");
		if(0 < column && column <= COLUMNS) {
			isValid = true;
		}
		return isValid;
    }
    
    /**
     * Populate chess board input
     * @param input
     * @return
     */
    public static ChessPosition populateChessInput(String input) {
    	char[] posArr = input.toCharArray();
    	ChessPosition chessInputPosition = new ChessPosition(new Integer(posArr[1] + ""), posArr[0] + "");
    	return chessInputPosition;
    }
    
    /**
     * Get previous row for current row
     * @param currRow
     * @return
     */
    public static String getPreviousRow(String currRow) {
    	int index = ROWS.indexOf(currRow);
    	String prevRow = null;
    	if(index > 0) {
    		prevRow = ROWS.get(index - 1);
    	}
    	return prevRow;
    }

    /**
     * Get next row for current row
     * @param currRow2
     * @return
     */
	public static String getNextRow(String currRow) {
		int index = ROWS.indexOf(currRow);
    	String nextRow = null;
    	if(index < (ROWS.size() - 1)) {
    		nextRow = ROWS.get(index + 1);
    	}
    	return nextRow;
	}
	
}
