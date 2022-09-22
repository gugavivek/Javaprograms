package com.datadriven.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataConfig1

{
	HSSFWorkbook wb;
	int index;
	HSSFSheet sheet ;

public ReadDataConfig1(String path) {
	try 
	{
		File src=new File(path);
		FileInputStream fis=new FileInputStream(src);
		wb = new HSSFWorkbook(fis);
	} 
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}

	} 

public int RowsCount(int sheetno)
{
sheet=wb.getSheetAt(sheetno);
int rowcount=sheet.getLastRowNum();
System.out.println(rowcount);
return rowcount;
//return rowcount+1;
}

	
public String ExcelSheetConfig(int sheetno,int rownumber,int columnnumber)
	
{
		sheet=wb.getSheetAt(sheetno);

	String data=sheet.getRow(rownumber).getCell(columnnumber).getStringCellValue();
	return data;
	
		//System.out.println("username is "+sheet.getRow(rownumber).getCell(columnnumber).getStringCellValue());
	
	}

public void WriteExcelSheet(String path,int sheetno,int rownumber,int columnumber,String value) throws IOException
{
	
			FileOutputStream fos;
			try 
			{
				File src=new File(path);
				fos = new FileOutputStream(src);
				wb.write(fos);

				sheet=wb.getSheetAt(sheetno);
				sheet.getRow(rownumber).createCell(columnumber).setCellValue( value);

			}
			catch (FileNotFoundException e) 
			{
				System.out.println(e.getMessage());
			}
				

}
}
	


