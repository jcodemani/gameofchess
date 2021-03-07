package com.test.project.gameofchess.chesspiece;

import com.test.project.gameofchess.ChessPieceFactory;
import com.test.project.gameofchess.dto.ChessPosition;
import com.test.project.gameofchess.exception.InvalidInputException;

/**
 * Represents Queen type of chess piece
 * @author apte
 *
 */
public class Queen implements ChessPiece {

	public String getPossibleMoves(ChessPosition inputDto) {
		StringBuilder possiblePositions = new StringBuilder();
		try {
			
			ChessPiece rook = ChessPieceFactory.getChessPieceForType("Rook");
			String rookPositions = rook.getPossibleMoves(inputDto);
			if(rookPositions != null && !rookPositions.isEmpty())
				possiblePositions.append(rookPositions);
			
			ChessPiece bishop = ChessPieceFactory.getChessPieceForType("Bishop");
			String bishopPositions = bishop.getPossibleMoves(inputDto);
			if(bishopPositions != null
					&& !bishopPositions.isEmpty()) {
				if(possiblePositions.length() > 0) 
					possiblePositions.append(",");
				possiblePositions.append(bishopPositions.toString());
			}
			
		} catch (InvalidInputException e) {
			System.out.print("Error: " + e.getMessage());
		}
		return possiblePositions.toString();
	}

}
