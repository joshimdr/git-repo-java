package com.josh.code.games.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Deck {

	int numberOfDecks = 0;

	ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() {
		// TODO Auto-generated constructor stub
		numberOfDecks = 1;
		initializeDeck();
	}

	public Deck(int numbOfDecks) {

		this.numberOfDecks = numbOfDecks;
		initializeDeck();

	}

	private void initializeDeck() {

		for (int i = 0; i < numberOfDecks; i++) {

			for (int j = 0; j < Suit.values().length; j++) {

				for (int k = 1; k <= 13; k++) {

					Card c = new Card(k, Suit.values()[j]);
					deck.add(c);

				}

			}

		}

	}
	
	
	
	public Card pullCardFromTop(){
		Card top = null;
		if(deck.size()>0){
			top = deck.remove(0);
		}
		return top;
	}
	
	

	public void shuffleDeck() {

		long seed = System.nanoTime();

		Collections.shuffle(deck, new Random(seed));
		/*
		 * Card[] deckAsArray = (Card[]) deck.toArray();
		 * 
		 * for (int i = 0; i < deckAsArray.length; i++) { Random ran = new
		 * Random(); int index = ran.nextInt(deckAsArray.length);
		 * 
		 * Card temp = deckAsArray[index]; deckAsArray[index] = deckAsArray[i];
		 * deckAsArray[i] = temp;
		 * 
		 * }
		 */
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[Total cards]:");
		sb.append(deck.size());
		for (Iterator iterator = deck.iterator();iterator.hasNext();) {
			Card card = (Card) iterator.next();
			sb.append(card);
		}
		
		return sb.toString();
	}
	
	
	
	
	
	

}
