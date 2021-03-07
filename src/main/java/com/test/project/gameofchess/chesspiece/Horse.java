package com.test.project.gameofchess.chesspiece;

import java.util.List;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents Horse type of chess piece
 * @author apte
 *
 */
public class Horse implements ChessPiece {

	public String getPossibleMoves(ChessPosition inputDto) {
		String currRow = inputDto.getCurrRow();
		int position = inputDto.getPosition();

		String prevRow = ChessPosition.getPreviousRow(currRow);
		String nextRow = ChessPosition.getNextRow(currRow);

		StringBuilder possiblePositions = new StringBuilder();
		if ((position - 2) >= 1) {// two positions below
			if(prevRow != null) {
				possiblePositions.append(prevRow);
				possiblePositions.append(position - 2);
			}
			
			if(nextRow != null) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(nextRow);
				possiblePositions.append(position - 2);
			}
		}

		if ((position + 2) <= ChessPosition.COLUMNS) {// two positions above
			if(prevRow != null) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(prevRow);
				possiblePositions.append(position + 2);
			}
			
			if(nextRow != null) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(nextRow);
				possiblePositions.append(position + 2);
			}
		}
		
		List<String> leftRows = ChessPosition.getAllToTheLeft(currRow);
		if(leftRows != null && leftRows.size() >= 2) {
			if((position - 1) >= 1) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(leftRows.get(1));
				possiblePositions.append(position - 1);
			}
			if((position + 1) <= ChessPosition.COLUMNS) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(leftRows.get(1));
				possiblePositions.append(position + 1);
			}
		}
		List<String> rightRows = ChessPosition.getAllToTheRight(currRow);
		if(rightRows != null && rightRows.size() >= 2) {
			if((position - 1) >= 1) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(rightRows.get(1));
				possiblePositions.append(position - 1);
			}
			if((position + 1) <= ChessPosition.COLUMNS) {
				if(possiblePositions.length() != 0) {
					possiblePositions.append(",");
				}
				possiblePositions.append(rightRows.get(1));
				possiblePositions.append(position + 1);
			}
		}
		return possiblePositions.toString();
	}

}
