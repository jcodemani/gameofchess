package com.test.project.gameofchess.chesspiece;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents King type of chess piece
 * @author apte
 *
 */
public class King implements ChessPiece {

	public void printPossibleMoves(ChessPosition inputDto) {
		
		String previousRow = ChessPosition.getPreviousRow(inputDto.getCurrRow());
		String nextRow = ChessPosition.getNextRow(inputDto.getCurrRow());
		
		StringBuilder possiblePositions = new StringBuilder();
		if(inputDto.getPosition() < ChessPosition.COLUMNS) {
			possiblePositions.append(inputDto.getCurrRow() + (inputDto.getPosition()+1));
			if (nextRow != null) {
				possiblePositions.append(",");
				possiblePositions.append(nextRow + (inputDto.getPosition()+1));
				possiblePositions.append(",");
				possiblePositions.append(nextRow + (inputDto.getPosition()));
			}
		}
		
		if(inputDto.getPosition() > 1) {
			if(possiblePositions.length() != 0)
				possiblePositions.append(",");
			if(nextRow != null) {				
				possiblePositions.append(nextRow + (inputDto.getPosition() - 1));
				possiblePositions.append(",");
			}
			possiblePositions.append(inputDto.getCurrRow() + (inputDto.getPosition() - 1));
			if(previousRow != null) {
				possiblePositions.append(",");
				possiblePositions.append(previousRow + (inputDto.getPosition() - 1));
			}
		}
		
		if(inputDto.getPosition() < ChessPosition.COLUMNS) { // checking condition again to maintain order of output same as mentioned
			if(previousRow != null) {
				if(possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(previousRow + (inputDto.getPosition()));
				possiblePositions.append(",");
				possiblePositions.append(previousRow + (inputDto.getPosition() + 1));
			}			
		}
		
		if(inputDto.getPosition() == ChessPosition.COLUMNS) {			
			if(previousRow != null) {
				if(possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(previousRow + inputDto.getPosition());
			}
			if(nextRow != null) {
				if(possiblePositions.length() != 0)
					possiblePositions.append(",");
				possiblePositions.append(nextRow + inputDto.getPosition());
			}
		}
		
		System.out.print(possiblePositions.toString());
	}
}
