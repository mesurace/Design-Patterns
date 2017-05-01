package com.cs525.lab4;

public class Lab4 {

	public static void main(String[] args) {
		Component cab = new Composite(6.0, 3.0);
		Component board = new Composite(26.0, 6.0);

		Component d1 = new Composite(10.0, 4.0);
		Component d2 = new Composite(10.0, 4.0);
		Component d3 = new Composite(10.0, 4.0);
		Component bus = new Composite(5.0, 1.0);

		Component card1 = new Composite(10.0, 1.0);
		Component card2 = new Composite(10.0, 1.0);
		Component card3 = new Composite(10.0, 1.0);

		cab.addComponent(board);
		cab.addComponent(d1);
		cab.addComponent(d2);
		cab.addComponent(d3);

		board.addComponent(bus);
		board.addComponent(card1);
		board.addComponent(card2);
		board.addComponent(card3);

		System.out.println("Total price of computer is : " + cab.computePrice());

	}

}
