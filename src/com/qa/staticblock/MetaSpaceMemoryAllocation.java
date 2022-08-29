package com.qa.staticblock;

 class Test
{

static
{
	System.out.println("this is from static block");
}
public static final int x=30;/**This calue is got from the metaspace

 through the keyword static which will not load the entire class and 
 
 get the value from the metaspace memory*/


}
public class MetaSpaceMemoryAllocation
{
public static void main(String[] args)

{
	
System.out.println (new Test().x);
}
}
