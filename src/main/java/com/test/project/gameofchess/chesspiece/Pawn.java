package com.test.project.gameofchess.chesspiece;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents Pawn type of chess piece
 * @author apte
 *
 */
public class Pawn implements ChessPiece {

	public String getPossibleMoves(ChessPosition inputDto) {
		String possiblePossition = "";
		if(inputDto.getPosition() < ChessPosition.COLUMNS) {
			possiblePossition = inputDto.getCurrRow() + (inputDto.getPosition() + 1);
		}
		return possiblePossition.toString();
	}

}
