package com.deck;

public abstract class Deck {
	public Card getCard() {
		shuffle();
		return getShuffledCard();
	}

	public abstract void shuffle();

	public abstract Card getShuffledCard();
}
