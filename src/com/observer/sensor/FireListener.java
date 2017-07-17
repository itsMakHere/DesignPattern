package com.observer.sensor;

public class FireListener implements AlarmListener {

	@Override
	public void alarm(int n) {
		System.out.println("Fire in the hole!!! and value is changed to :-  "+n);
	}

}
