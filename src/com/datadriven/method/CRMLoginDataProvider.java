package com.datadriven.method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CRMLoginDataProvider 
{

	ReadDataConfig1 obj1=new ReadDataConfig1("/Users/Guga/Documents/DataProvider.xls");
	
@Test(dataProvider="CRMLogin")
public void CRMLogin(String username,String password)
{
	
		
		System.setProperty("webdriver.chrome.driver", "/Users/Guga/Documents/Selenium/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ttt1-485199804051981877.myfreshworks.com/login?redirect_uri=https%3A%2F%2Fttt1-485199804051981877.myfreshworks.com%2F");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

@DataProvider(name="CRMLogin")
public Object[] passdata()
{
	Object[][] data =new Object[3][2];
	//for(int i=1;i<obj1.RowsCount(1);i++) when rowcount=4/return rowcount+1

	for(int i=1;i<=obj1.RowsCount(1);i++)
	{
		
		
	data[i-1][0]=obj1.ExcelSheetConfig(1, i, 0);
	data[i-1][1]=obj1.ExcelSheetConfig(1, i, 1);
	
	
	}
	return data;
	
}
}
