package com.test.project.gameofchess;

public class ChessInputDto {

	int position;
	char currRow;
	char prevPossibleRow; // returns previous possible row
	char nextPossibleRow; // returns next possible row.

	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public char getCurrRow() {
		return currRow;
	}
	public void setCurrRow(char currRow) {
		this.currRow = currRow;
	}
	public char getPrevPossibleRow() {
		return prevPossibleRow;
	}
	public void setPrevPossibleRow(char prevPossibleRow) {
		this.prevPossibleRow = prevPossibleRow;
	}
	public char getNextPossibleRow() {
		return nextPossibleRow;
	}
	public void setNextPossibleRow(char nextPossibleRow) {
		this.nextPossibleRow = nextPossibleRow;
	}
	
}
