package com.josh.code.games.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		GameBoard gb = new GameBoard();

		gb.initializeBoard();

		gb.drawBoard();

		int counter = 0;

		int x = 0, y = 0;
		char player = 'x';

		while (gb.gameActive()) {

			do {
				if (counter % 2 == 0) {
					player = 'x';
				} else {
					player = 'y';
				}

				System.out.println("Player '" + player + "'s turn -  Please enter row value=");
				Scanner scanner = new Scanner(System.in);

				x = scanner.nextInt();
				System.out.println("Player '" + player + "'s turn -  Please enter column value=");
				y = scanner.nextInt();

			} while (gb.invalidInput(x, y));

			gb.markTheSpot(player, x, y);
			
			if(gb.checkIfThereIsAWinner(player, x, y)){
			
				System.out.println("We have the winner !! Winner Mr: "+player);
			}
			gb.drawBoard();

			counter++;

		}

	}

}
