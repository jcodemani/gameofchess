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
	 * @param inputDto
	 * @return String : all posible positions of a ChessPiece in 
	 *         comma separated format e.g. D6,E6,E5,E4,	D4,	C4,	C5,	C6
	 *         for given ChessPostion
	 */
	public String getPossibleMoves(ChessPosition inputDto);

}
