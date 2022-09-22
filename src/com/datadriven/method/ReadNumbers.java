package com.datadriven.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadNumbers 
{

	public static void main(String[] args) throws Exception
	{
		File src=new File("/Users/Guga/Documents/DataProvider.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		int RowCount=sheet.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
			String data0=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(i+"st username is "+ data0);	


		}
		
		
		
		
		
		
		
		wb.close(); 

	}

}
