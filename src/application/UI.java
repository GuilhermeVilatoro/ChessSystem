package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] chessPieces) {
		for (int i = 0; i < chessPieces.length; i++) {
			System.out.print((chessPieces.length - i) + " ");
			for (int j = 0; j < chessPieces.length; j++) {
				printPiece(chessPieces[i][j]);				
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
	}

	private static void printPiece(ChessPiece chessPiece) {
		String printPiece = "-";
		if (chessPiece != null)
			printPiece = chessPiece.toString();

		System.out.print(printPiece + " ");
	}
}
