package com.josh.code.games.snakeGame;

import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Snake {

	static String[][] board = new String[20][20];

	static LinkedList<Coords> snake = new LinkedList<Coords>();

	static Coords fruit;

	static String fruitSymbol = "o";

	static String snameSymbol = "@";

	public void initializeBoard() {
		Coords coods = new Coords(0, 0);
		snake.add(coods);
		fruit = new Coords(10, 10);

	}

	public static void main(String[] args) {
		while (true) {
			
			

		}
	}

	public static void drawboard() {
		for (int i = 0; i < board.length; i++) {

		}
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP:
			// handle up

			moveHeadRemoveTail(keyCode);

			break;
		case KeyEvent.VK_DOWN:

			moveHeadRemoveTail(keyCode);
			// handle down
			break;
		case KeyEvent.VK_LEFT:
			// handle left
			moveHeadRemoveTail(keyCode);
			break;
		case KeyEvent.VK_RIGHT:
			// handle right
			moveHeadRemoveTail(keyCode);
			break;
		}
	}
	
	

	private void moveHeadRemoveTail(int keyCode) {
		snake.removeLast();

		Coords currentHead = snake.getFirst();

		int currentHeadX = currentHead.getX();
		int currentHeadY = currentHead.getY();

		int newX = currentHeadX;
		int newY = currentHeadY;
		if (keyCode == KeyEvent.VK_UP) {
			newX = currentHeadX - 1;
			newY = currentHeadY;
		}
		if (keyCode == KeyEvent.VK_DOWN) {
			newX = currentHeadX + 1;
			newY = currentHeadY;
		}
		if (keyCode == KeyEvent.VK_LEFT) {
			newX = currentHeadX;
			newY = currentHeadY - 1;
		}
		if (keyCode == KeyEvent.VK_RIGHT) {
			newX = currentHeadX;
			newY = currentHeadY + 1;
		}

		// on up array key move the snake up
		Coords newHead = new Coords(newX, newY);

		snake.addFirst(newHead);
	}

}

class Coords {

	int x = 0;
	int y = 0;

	public Coords() {
		// TODO Auto-generated constructor stub
	}

	public Coords(int x, int y) {
		// TODO Auto-generated constructor stub

		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

}
