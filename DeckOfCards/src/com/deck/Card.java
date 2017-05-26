package com.deck;

public class Card {

	private Suit suit;
	private CardValue value;

	Card(Suit suit, CardValue value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public CardValue getValue() {
		return value;
	}
	
	public String toString(){
		return "Card : "+ suit+" "+ value;
	}

}
