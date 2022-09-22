package com.qa.staticblock;

public class StaticBlockwithPrivateConstructor
{
	// static int age=49;

	public static void main(String[] args) 
	{
	//StaticBlockwithPrivateConstructor obj=new StaticBlockwithPrivateConstructor();
	//	System.out.println(obj.age );
		System.out.println(height);
		
	
	}
	/**  How can we create  objects outside the
	 * 
	 *  
	 *  class if we make constructor private?**/
	
	
	
	/** We cant access the private member variable inside the constructor even with object.
	 * 
	 * 
	 * Thats why it should be declared outside the method*/
//	*****************************************************
	static 
	{
		StaticBlockwithPrivateConstructor obj1=new StaticBlockwithPrivateConstructor();
		System.out.println(obj1.age);
	//	System.out.println(age=66);
		
	}
	//************************************************\u000d static int  height=32;
	/*/u00d
	 * this is a Unicode Carriage return*/
	
	
	public static void staticmethod()
	{
		StaticBlockwithPrivateConstructor obj2=new StaticBlockwithPrivateConstructor();

	}
	private StaticBlockwithPrivateConstructor()
	{
		//System.out.println("picking from the constructor");
		age=44;
	}

}
