package com.singleton;

public class Main {
	public static void main(String[] args) {
		SingletonEnum s = SingletonEnum.INSTANCE;
		SingletonEnum s1 = SingletonEnum.INSTANCE;
		SingletonEnum s2 = SingletonEnum.INSTANCE;
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(SingletonEnum.INSTANCE);
		
		
		SingletoneObject.getInstance();
	}
}
