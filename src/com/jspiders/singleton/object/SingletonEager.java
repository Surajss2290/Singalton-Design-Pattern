package com.jspiders.singleton.object;

public class SingletonEager {
	
	static SingletonEager object=new SingletonEager();

	private SingletonEager() {
		System.out.println("constructed created");
	}
	
	public static SingletonEager getObject() {
		System.out.println("methode accessed");
		return object;
	}
	

}