package tictactoeworkshop;

public class TicTacToeGame {

	char[] board;

	// uc1
	public static char[] gameBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe");
		gameBoard();

	}

}