package com.cs525.lab5;

public class PopCommand implements Command {
	
	Receiver receiver;
	PopCommand(Receiver receiver){
		this.receiver=receiver;
	}

	@Override
	public void execute() {
		receiver.popMethod();
		
	}

}
