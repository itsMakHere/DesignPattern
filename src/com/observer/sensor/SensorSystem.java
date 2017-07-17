package com.observer.sensor;


import java.util.ArrayList;
import java.util.List;


public class SensorSystem {
	
	public List<AlarmListener> alarmListener = new ArrayList<AlarmListener>();
	
	public void attachListener(AlarmListener al){
		alarmListener.add(al);
	}
	
	public void soundAlarm(){
		notifyAllObserver(15);
	}

	private void notifyAllObserver(int n) {
		for(AlarmListener al : alarmListener){
			if(al instanceof LightListener)
				al.alarm(n+5);
		}
		
	}

}
