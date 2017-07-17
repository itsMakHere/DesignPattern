package com.observer.sensor;

public class LightListener implements AlarmListener {

	@Override
	public void alarm(int n) {
		System.out.println("Ligts Up and value is changed to :-  "+n);
	}

}
