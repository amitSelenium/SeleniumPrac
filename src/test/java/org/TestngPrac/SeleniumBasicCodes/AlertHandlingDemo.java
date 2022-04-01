package org.TestngPrac.SeleniumBasicCodes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandlingDemo 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		
		//This will launch an empty chrome browser
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
		
		//Switching to alert
		Alert alertPopup = driver.switchTo().alert();
		String popupText = alertPopup.getText();
		System.out.println(popupText);
		alertPopup.accept();
		String alertType = driver.findElement(By.id("output")).getText();
		System.out.println(alertType);
		
		//Confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmationPopup = driver.switchTo().alert();
		String confirmationPopupText = confirmationPopup.getText();
		System.out.println(confirmationPopupText);
		confirmationPopup.dismiss();
		String alertType1 = driver.findElement(By.id("output")).getText();
		System.out.println(alertType1);
		
		
		//Prompt alert
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert promptPopup = driver.switchTo().alert();
		String promptPopupText = promptPopup.getText();
		System.out.println(promptPopupText);
		promptPopup.sendKeys("Amitesh");
		Thread.sleep(100);
		String alertType2 = driver.findElement(By.id("output")).getText();
		System.out.println(alertType2);
	}
}
