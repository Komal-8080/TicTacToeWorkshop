package tictactoeworkshop;

import java.util.Scanner;

public class TicTacToeGame {

	char[] board;
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
		while(loop == 0) {
			System.out.println("Enter X or O");
			Scanner read = new Scanner(System.in);
			player = read.next().toUpperCase().charAt(0);
				if(player == 'X' || player == 'O') {
					return player;
					}
				else {
					System.out.println ("Invalid Input");
					continue;
				}
			
			}
		return player;
		}

	// Main method
	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe");
		gameBoard();
		selectXor0();

	}

}