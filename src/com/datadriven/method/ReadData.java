package com.datadriven.method;

import java.io.IOException;

public class ReadData 
{

	public static void main(String[] args) throws IOException 
	{
		
	//	ReadDataConfig1 config=new ReadDataConfig1("/Users/Guga/Documents/DataProvider.xls");
		//config.ExcelSheetConfig(0,1,0);
		ReadDataConfig1 config=new ReadDataConfig1("/Users/Guga/Documents/DataProvider.xls");
		//config.WriteExcelSheet("/Users/Guga/Documents/DataProvider.xls",0,1,2,"facebook");
		//config.WriteExcelSheet("/Users/Guga/Documents/DataProvider.xls",0,2,2,"whatsapp");
		config.WriteExcelSheet("/Users/Guga/Documents/DataProvider.xls",0,3,2,"peepa");


	}

}

