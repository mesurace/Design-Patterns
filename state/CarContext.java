package com.cs525.lab6;

public class CarContext {
	GearState currentState;

	CarContext() {
		setCurrentState(new ParkState());

	}

	public void setCurrentState(GearState currentState) {
		this.currentState = currentState;
	}

	public int changeSpeed(int speed) {

		currentState.handle(this, speed);
		return currentState.value();
	}

}
