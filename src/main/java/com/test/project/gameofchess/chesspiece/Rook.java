package com.test.project.gameofchess.chesspiece;

import java.util.List;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents Rook type of chess piece
 * @author Manasi Apte
 *
 */
public class Rook implements ChessPiece {

	
	public String getPossibleMoves(ChessPosition inputDto) {
		
		String currRow = inputDto.getCurrRow();
		int currPosition = inputDto.getPosition();
		
		StringBuilder possiblePositions = new StringBuilder();
		
		if(currPosition > ChessPosition.START_COLUMNS) {// print verticle down
			int printPosition = currPosition - 1;			
			while(printPosition >= ChessPosition.START_COLUMNS) {
				if(possiblePositions.length() > 0)
					possiblePositions.append(",");
				possiblePositions.append(currRow);
				possiblePositions.append(printPosition);
				printPosition--;
			}			
		}
		
		if(currPosition < ChessPosition.COLUMNS) {// print verticle up
			int printPosition = currPosition + 1;			
			while(printPosition <= ChessPosition.COLUMNS) {
				if(possiblePositions.length() > 0)
					possiblePositions.append(",");
				possiblePositions.append(currRow);
				possiblePositions.append(printPosition);
				printPosition++;
			}			
		}
		
		List<String> leftPositions = ChessPosition.getAllToTheLeft(currRow);
		printAllWithPosition(leftPositions, currPosition, possiblePositions);
		
		List<String> rightPositions = ChessPosition.getAllToTheRight(currRow);
		printAllWithPosition(rightPositions, currPosition, possiblePositions);
		
		return possiblePositions.toString();
	}

	/**
	 * Print all rows for currentPostion
	 * @param listPositions
	 * @param currPosition
	 * @param possiblePositions
	 */
	private void printAllWithPosition(List<String> listPositions, int currPosition, StringBuilder possiblePositions) {
		if(listPositions != null && !listPositions.isEmpty()) {			
			for(String row : listPositions) {
				if(possiblePositions.length() > 0)
					possiblePositions.append(",");				
				possiblePositions.append(row + currPosition);
			}
		}
	}

}
