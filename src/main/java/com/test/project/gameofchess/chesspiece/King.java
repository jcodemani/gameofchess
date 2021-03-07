package com.test.project.gameofchess.chesspiece;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents King type of chess piece
 * @author apte
 *
 */
public class King implements ChessPiece {

	public String getPossibleMoves(ChessPosition inputDto) {
		
		String previousRow = ChessPosition.getPreviousRow(inputDto.getCurrRow());
		String nextRow = ChessPosition.getNextRow(inputDto.getCurrRow());
		
		String currRow = inputDto.getCurrRow();
		int currPosition = inputDto.getPosition();
		
		StringBuilder possiblePositions = new StringBuilder();
		
		if(currPosition > 1) {
			if (previousRow != null) {
				possiblePositions.append(previousRow);
				possiblePositions.append(currPosition);
				possiblePositions.append(",");
				possiblePositions.append(previousRow);
				possiblePositions.append(currPosition - 1);
			}
			
			if (nextRow != null) {
				if (possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(nextRow);
				possiblePositions.append(currPosition);
				possiblePositions.append(",");
				possiblePositions.append(nextRow);
				possiblePositions.append(currPosition - 1);
			}
			
			if(possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(currRow);
				possiblePositions.append(currPosition - 1);
		}
		
		if(currPosition < ChessPosition.COLUMNS) {
			if(possiblePositions.length() != 0)
				possiblePositions.append(",");
			possiblePositions.append(currRow);
			possiblePositions.append(currPosition + 1);
			
			if (previousRow != null) {
				if (possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(previousRow);
				possiblePositions.append(currPosition + 1);
			}
			
			if (nextRow != null) {
				if (possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(nextRow);
				possiblePositions.append(currPosition + 1);
			}
		}
		
		return possiblePositions.toString();
	}
}
