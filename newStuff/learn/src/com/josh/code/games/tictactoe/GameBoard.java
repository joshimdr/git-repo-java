package com.josh.code.games.tictactoe;

import java.util.Arrays;

public class GameBoard {

	char[][] gameboard = new char[3][3];

	boolean gameActive = true;

	public void initializeBoard() {

		for (int i = 0; i < gameboard[0].length; i++) {
			Arrays.fill(gameboard[i], ' ');
		}

	}

	public void drawBoard() {

		for (int i = 0; i < gameboard.length; i++) {

			for (int j = 0; j < gameboard[0].length; j++) {

				System.out.print(gameboard[i][j]);

				if (j < 2) {
					System.out.print("  | ");
				}

			}
			System.out.println();
			if (i < 2) {
				System.out.println("---------------");
			}

		}

	}

	public boolean invalidInput(int x, int y) {
		// TODO Auto-generated method stub
		if (x < 1 || x > 3 || y < 1 || y > 3) {
			System.out.println("Please enter a valid value of x and y ");
			return true;
		} else if (gameboard[x - 1][y - 1] != ' ') {
			System.out.println("Spot is already maked, please enter a valid spot!");
			return true;
		} else {
			return false;
		}
	}

	public void markTheSpot(char markWith, int x, int y) {

		gameboard[x - 1][y - 1] = markWith;

	}

	public boolean checkIfThereIsAWinner(char markWith, int x, int y) {

		boolean winner = true;

		// Check all cols for winner
		for (int i = 0; i < gameboard[0].length; i++) {
			if (gameboard[x - 1][i] != markWith) {
				winner = false;
				break;
			}
			if (i == gameboard[0].length - 1) {
				winner = true;
			}

		}

		// check all rows for winner
		if (!winner) {

			for (int i = 0; i < gameboard.length; i++) {
				if (gameboard[i][y - 1] != markWith) {
					winner = false;
					break;
				}
				if (i == gameboard.length - 1) {
					winner = true;
				}

			}

			// check for diagonals
			if (!winner) {

				for (int i = 0; i < gameboard.length; i++) {
					if (gameboard[i][i] != markWith) {
						winner = false;
						break;
					}
					if (i == gameboard.length - 1) {
						winner = true;
					}

				}
			}

			// check for reverse diagonals

			// check for diagonals
			if (!winner) {

				for (int i = 0; i < gameboard.length; i++) {
					if (gameboard[i][(gameboard[0].length - 1) - i] != markWith) {
						winner = false;
						break;
					}
					if (i == gameboard.length - 1) {
						winner = true;
					}

				}
			}

		}

		// Game is active if there is no winner
		gameActive = !winner;

		return winner;
	}

	public boolean gameActive() {
		// TODO Auto-generated method stub
		return gameActive;
	}

}
