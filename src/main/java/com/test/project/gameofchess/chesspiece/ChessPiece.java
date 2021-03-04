package com.test.project.gameofchess.chesspiece;

import com.test.project.gameofchess.dto.ChessPosition;

/**
 * Represents ChessPiece
 * @author apte
 *
 */
public interface ChessPiece {
	
	/**
	 * 
	 * @param inputDto : input regarding current chess position.
	 */
	public void printPossibleMoves(ChessPosition inputDto);

}
