package Project.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import actions.Actions;
import objectRepo.ObjectRepository;

public class Utility 
{
	String path=System.getProperty("user.dir");
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuite() throws Exception 
	{
		try 
		{
		System.out.println("This is Path location ========== "+path);
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://tollplus.agsindia.com/2.0/RetailerWeb/Default.aspx");
		driver.manage().window().maximize();
		
		
		
		
		}
		catch(Exception e) 
		{
			throw e;
		}
	}
	
	
	
//	@AfterSuite
//	public void Quit() 
//	{
//		driver.quit();
//	}

}