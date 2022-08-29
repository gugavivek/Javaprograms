package com.qa.staticblock;

public class InstanceInitialization {

	public static void main(String[] args) 
	{
		InstanceInitialization obj=new InstanceInitialization();
	}
	static {
		System.out.println("This is from static block");
	}
	/**Instance Initialization will be called only 
	 * after creating object similar to constructor***/
	{
		System.out.println("this is from instance initialization block");
	}
	public InstanceInitialization()
	{
		System.out.println("This is from constructor method");

	}

}
