package org.TestngPrac.SeleniumBasicCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCode 
{
	@Test
	public void navigatingBackAndForward() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("https://www.youtube.com", Keys.ENTER);
		Thread.sleep(2000);
		//Refreshing the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Navigating to icici bank website
		driver.navigate().to("https://www.icicibank.com/");
		Thread.sleep(2000);
		
		//Navigating to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Navigating again to icici bank website
		driver.navigate().forward();
		driver.quit();
	}
}
