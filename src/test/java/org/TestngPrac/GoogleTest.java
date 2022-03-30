package org.TestngPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest
{
	@Test
	public void testGoogleSearch()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hyr tutorials",Keys.ENTER);
		driver.findElement(By.partialLinkText("hyrtutorials")).click();
		driver.findElement(By.id("Header1_headerimg")).isDisplayed();
		driver.quit();
	}
}
