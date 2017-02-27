package com.josh.code.games.blackjack;

import java.util.ArrayList;
import java.util.Iterator;

public class Player {

	String name;
	ArrayList<Card> hand;
	int totalInHand = 0;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String name) {
		this.name = name;
		hand = new ArrayList<Card>();
	}

	public void getCard(Card card) {
		if (card != null) {
			hand.add(card);
			totalInHand = totalInHand + card.number;
		}
	}
	
	/**
	 * check if the player hits a black jack
	 * @return
	 */
	public boolean checkIfPlayerHitsBlackJack() {

		Iterator<Card> it = hand.iterator();
		boolean isBlackJack = false;

		int sum = 0;
		int aces = 0;

		while (it.hasNext()) {
			Card card = (Card) it.next();
			int num = card.number;
			if (num == 1) {
				num = 11;
				aces++;
			} else if (num >= 10) {
				num = 10;
			}
			sum = sum + num;
		}

		if (sum == 21) {
			isBlackJack = true;
		} else if (sum > 21 && aces > 0) {

			while (aces > 0) {

				sum = sum - 10;
				if (sum == 21) {
					isBlackJack = true;
					break;
				}
				aces--;
			}

		}

		return isBlackJack;
	}
	
	
	/**
	 * check if the player hits a black jack
	 * @return
	 */
	public int playerCurrentTotal() {

		Iterator<Card> it = hand.iterator();
		

		int sum = 0;
		int aces = 0;

		while (it.hasNext()) {
			Card card = (Card) it.next();
			int num = card.number;
			if (num == 1) {
				num = 11;
				aces++;
			} else if (num >= 10) {
				num = 10;
			}
			sum = sum + num;
		}

		if (sum > 21 && aces > 0) {

			while (aces > 0) {
				sum = sum - 10;
				aces--;
			}

		}

		return sum;
	}


	/**
	 * check if the player is busted, i.e. his total in hand cards are greater than 21
	 * @return
	 */
	public boolean checkIfPlayerGoesBust() {

		Iterator<Card> it = hand.iterator();
		boolean isPlayerBust = false;

		int sum = 0;
		int aces = 0;

		while (it.hasNext()) {
			Card card = (Card) it.next();
			int num = card.number;
			if (num == 1) {
				num = 11;
				aces++;
			} else if (num >= 10) {
				num = 10;
			}
			sum = sum + num;
		}

		if (sum > 21 && aces == 0) {
			isPlayerBust = true;
		} else if (sum > 21 && aces > 0) {

			sum = sum - (10 * aces);
			if (sum > 21) {
				isPlayerBust = true;

			}

		}

		return isPlayerBust;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [name=");
		builder.append(name);
		builder.append(", hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
