package tictactoeworkshop;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = gameBoard();
	static char player = ' ';

	// UC1-creating game board
	public static char[] gameBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// UC2-Method to allow player to choose "x" or "o"
	public static char selectXor0() {
		int loop = 0;
		System.out.println("Enter X or O");
		Scanner read = new Scanner(System.in);
		player = read.next().toUpperCase().charAt(0);
		if (player == 'X' || player == 'O') {
			System.out.println("Player Input: "+player);
			return player;
		} 
		else {
			System.out.println("Invalid Input");
		}
		return player;
	}
	
	//UC3-Method to display TicTacToe Board 
	public static void displayBoard() {	
	
		for (int i=1; i < board.length; i=i+3) {
			System.out.println(board[i]+"|"+board[i+1]+"|"+board[i+2]);
			System.out.println("------");
		} 
	}

	// Main method
	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe");
		gameBoard();
		selectXor0();
		displayBoard();

	}

}