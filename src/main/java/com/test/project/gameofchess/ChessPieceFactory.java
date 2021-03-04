package com.test.project.gameofchess;

import java.util.HashMap;
import java.util.Map;

import com.test.project.gameofchess.chesspiece.ChessPiece;
import com.test.project.gameofchess.chesspiece.King;
import com.test.project.gameofchess.exception.InvalidInputException;

/**
 * Factory to provide instance of ChessPiece based on type of chess piece
 * @author apte
 *
 */
public class ChessPieceFactory {
	
	private static Map<String, ChessPiece> chessPieceTypeToInstance;

	static {
		chessPieceTypeToInstance = new HashMap<String, ChessPiece>();
		chessPieceTypeToInstance.put("King", new King());
	}
	
	/**
	 * Return instance of chess piece based on type, returns 
	 * null if type is not supported.
	 * @param type : type of chess piece
	 * @return ChessPiece
	 * @throws InvalidInputException 
	 */
	public static ChessPiece getChessPieceForType(String type) throws InvalidInputException {
		ChessPiece chessPiece = chessPieceTypeToInstance.get(type);
		if(chessPiece == null)
			throw new InvalidInputException(InvalidInputException.UNSUPPOERTED_INPUT_EXCEPTION);
		return chessPiece;
	}

}
