package chess;

import boardgame.Board;
import boardgame.Position;
import chess.enums.Color;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < chessPieces.length; i++) {
			for (int j = 0; j < chessPieces.length; j++) {
				chessPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return chessPieces;
	}

	private void initialSetup() {
		board.placePiece(new King(board, Color.WHITE), new Position(0, 2));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 3));
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 5));
	}
}
