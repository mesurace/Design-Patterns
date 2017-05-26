package com.unittest;

import org.junit.Test;

import com.deck.Deck;
import com.deck.DeckImp;

public class DeckTest {

	@Test
	public void test() {
		Deck deck = new DeckImp();
		System.out.println(deck.getCard());
	}

}
