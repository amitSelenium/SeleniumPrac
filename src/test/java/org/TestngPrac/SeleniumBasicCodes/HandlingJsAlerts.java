package org.TestngPrac.SeleniumBasicCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJsAlerts
{	
	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert = driver.switchTo().alert();
		String originalText = alert.getText();
		System.out.println(originalText);
		String expectedText = "Please enter a valid user name";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(originalText, expectedText);
		alert.accept();
		driver.quit();
	}
}
