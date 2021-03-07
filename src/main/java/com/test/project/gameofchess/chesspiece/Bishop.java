package com.test.project.gameofchess.chesspiece;

import java.util.List;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents Bishop type of chess piece
 * @author apte
 *
 */
public class Bishop implements ChessPiece {

	public String getPossibleMoves(ChessPosition inputDto) {
		StringBuilder possiblePositions = new StringBuilder();
		
		String currRow = inputDto.getCurrRow();
		int currPosition = inputDto.getPosition();
		
		List<String> leftRows = ChessPosition.getAllToTheLeft(currRow);
		if(leftRows != null) {
			printAllDiagonals(currPosition, leftRows, possiblePositions);
		}
		List<String> rightRows = ChessPosition.getAllToTheRight(currRow);
		if(rightRows != null) {
			printAllDiagonals(currPosition, rightRows, possiblePositions);
		}
		
		return possiblePositions.toString();
	}

	/**
	 * Print all diagonal positions above and below for given rows
	 * @param currPosition
	 * @param rows
	 * @param possiblePositions
	 */
	private void printAllDiagonals(int currPosition, List<String> rows, StringBuilder possiblePositions) {
		if(currPosition > 1) { // Rows below
			int printPosition = currPosition-1;
			for(String row : rows) {
				if (printPosition >= 1) {
					if (possiblePositions.length() != 0)
						possiblePositions.append(",");
					possiblePositions.append(row);
					possiblePositions.append(printPosition);
					printPosition--;
				} else {
					break;
				}				
			}
		}
		
		if(currPosition < ChessPosition.COLUMNS) {
			int printPosition = currPosition+1;
			for(String row : rows) {
				if (printPosition <= ChessPosition.COLUMNS) {
					if (possiblePositions.length() != 0)
						possiblePositions.append(",");
					possiblePositions.append(row);
					possiblePositions.append(printPosition);
					printPosition++;
				} else {
					break;
				}				
			}
		}
	}

}
