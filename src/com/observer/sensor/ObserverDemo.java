package com.observer.sensor;

public class ObserverDemo {

	public static void main(String[] args) {
		SensorSystem ss = new SensorSystem();
		ss.attachListener(new LightListener());
		ss.attachListener(new FireListener());
		
		for(int ctr = 0; ctr <20; ctr++)
		ss.soundAlarm();
		

	}

}
