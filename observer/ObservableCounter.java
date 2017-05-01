package com.cs525.lab0;

import java.util.ArrayList;
import java.util.List;

public class ObservableCounter {
	int count = 0;
	List<ObserverFrame> frames = new ArrayList<>();

	public void addFrame(ObserverFrame observerFrame) {
		
		frames.add(observerFrame);
		
	}

	public void increment() {
		count++;
		for (ObserverFrame observerFrame : frames) {
			observerFrame.setCount(count);
		}
	}

	public void decrement() {
		if (count > 0){
			count--;
		for (ObserverFrame observerFrame : frames) {
			observerFrame.setCount(count);
		}
		}
	}
}
