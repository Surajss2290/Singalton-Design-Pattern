package com.jspiders.singleton.object;

public class SingletonLazy {
static SingletonLazy object;

private SingletonLazy() {
	System.out.println("constructor accessed");
}

public static SingletonLazy getobject() {
	
	if(object==null) {
		System.out.println("object created");
		object=new SingletonLazy();
		
	}
	return object;
	
}


}
