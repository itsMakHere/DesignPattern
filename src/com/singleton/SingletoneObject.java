package com.singleton;

public class SingletoneObject {
	private static SingletoneObject singletoneObject;
	public static int count = 0;
	
	private SingletoneObject(){}
	
	public static SingletoneObject getInstance(){
		if(null == singletoneObject){
			synchronized (SingletoneObject.class) {
				if(null == singletoneObject){
					singletoneObject = new SingletoneObject();
					count++;
				}
			}
		}
		return singletoneObject;
	}
	
	public static void printNoOfObjectCreated(){
		System.out.println(count);
	}

}
