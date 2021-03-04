package com.test.project.gameofchess.chesspiece;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents Pawn type of chess piece
 * @author apte
 *
 */
public class Pawn implements ChessPiece {

	public void printPossibleMoves(ChessPosition inputDto) {
		String possiblePossition = "";
		if(inputDto.getPosition() < 8) {
			possiblePossition = inputDto.getCurrRow() + (inputDto.getPosition() + 1);
		}
		System.out.println(possiblePossition);
	}

}
