package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Project.Project.Utility;

public class Actions extends Utility
{
	//public static WebDriver driver;
	public static WebElement locator;
	public Utility utl;
	
	public Actions(WebDriver driver)
	{
	
		utl=new Utility();
		this.driver=utl.driver;
		//Actions.driver=driver;
	}

	
	public static void click(By by, String desc) throws Exception 
	{
		try {
		locator = driver.findElement(by);
		locator.click();
		System.out.println(desc);
		}
		catch(Exception e) 
		{
			throw e;
		}
		
	}
	public static void sendKeys(By by, String value, String desc) throws Exception 
	{
		try 
		{
			locator=driver.findElement(by);
			locator.sendKeys(value);
			System.out.println(desc);
			
		}
		catch(Exception e) 
		{
			throw e;
		}
	}
	
	public static void pause(int time) throws Exception 
	{
		try 
		{
			Thread.sleep(time*1000);
		}
		catch(Exception e) 
		{
			throw e;
		}
	}
	
}
