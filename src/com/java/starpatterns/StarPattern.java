package com.java.starpatterns;

public class StarPattern
{

	public static void main(String[] args) 
	{
		System.out.println("main method");
		//forwardmethod(5);
		 // bacwardmethod(4);
		//alphabetstar(5);
	}
		
	 static void forwardmethod(int size)
		{
			for(int i=0;i<size;i++)
			{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
				System.out.print(" ");
			}
			System.out.println();
			}
		}

public static void bacwardmethod(int size)
{
	for(int i=0;i<size;i++)
	{
	for(int j=size;j>i;j--)
	{	
	System.out.print("*");
	System.out.print(" ");
	}

	System.out.println();
	}
}
public static void alphabetstar(int size)
{
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<=i;j++)
		{
			//System.out.print((char)(65+j));
			System.out.print((char)(65+i));

			System.out.print(" ");
		}
		System.out.println();
	}
}
}


