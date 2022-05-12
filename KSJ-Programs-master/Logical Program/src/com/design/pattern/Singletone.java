package com.design.pattern;

public class Singletone {
	
	private static Singletone singletone;
	
	static {
		singletone= new Singletone();
		System.out.println("Object is Created ");
	}
	
	private Singletone()
	{
		
		
	}
	public static Singletone getInstanceOf()
	{
		return singletone;
	}

	public static void main(String[] args) {
	
		 Singletone single= Singletone.getInstanceOf();
		 Singletone single1= Singletone.getInstanceOf();
		 
		 System.out.println(single.hashCode()+ "   "+single1.hashCode());

	}

}
