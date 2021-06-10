package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	
	
	
	@Test
	public void logintest()
	{
		SoftAssert SA = new SoftAssert();
		String title  = "Hobbycraft | Shop Craft Supplies Online";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.hobbycraft.co.uk/");
		
		System.out.println("logintest");
		String ActualTitle  = driver.getTitle();
		SA.assertEquals(title, ActualTitle,"main page title assert");
		driver.findElement(By.id("ctl00_hchdr1_signinlink1")).click();
		ActualTitle  = driver.getCurrentUrl();
	//	System.out.print(driver.getPageSource());
		SA.assertEquals("Register | Hobbycraft", ActualTitle,"login page title assert");
		driver.close();
		SA.assertAll();
		
	}
}	
