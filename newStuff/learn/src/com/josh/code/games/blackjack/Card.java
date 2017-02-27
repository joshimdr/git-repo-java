package com.josh.code.games.blackjack;

public class Card {
	
	int number;
	
	Suit suit;
	
	
	public Card() {
	
	}


	public Card(int number, Suit suit) {
		this.number = number;
		this.suit = suit;
	}


	
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}


	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}


	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}


	/**
	 * @param suit the suit to set
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n");
		switch (number) {

		case 11:
			builder.append(" Jack ");
			break;
		case 12:
			builder.append(" Queen ");
			break;
		case 13:
			builder.append(" King ");
			break;
		case 1:
			builder.append(" Ace ");
			break;
		default:
			builder.append(" " + number + " ");

		}

		builder.append(" of ");
		builder.append(suit);
		return builder.toString();
	}
	
	
	
	
	



}
