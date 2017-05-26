package com.deck;

import java.util.concurrent.ThreadLocalRandom;

public class DeckImp extends Deck {

	Card card;

	@Override
	public void shuffle() {
		card = new Card(Suit.values()[getRandomNumber(0, 3)], CardValue.values()[getRandomNumber(0, 12)]);

	}

	@Override
	public Card getShuffledCard() {

		return card;
	}

	private int getRandomNumber(int a, int b) {
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

}
