package com.cs525.lab5;

public class Invoker {

	public void invoke(Command command) {
		command.execute();
	}
}
