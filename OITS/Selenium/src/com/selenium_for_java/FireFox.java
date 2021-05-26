package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/OITS/jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("http://facebook.com");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sirija Kasi");

		// ----------Not Working---------------
		driver.get("https://www.glassdoor.co.in/index.htm");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();

		
		
		// -------------Not Working---------------
//		driver.get("https://www.geeksforgeeks.org/");
//		driver.findElement(By.xpath("//a[text()='Sign In']")).click();

		// -------------Its Working---------------
//		driver.get("https://www.glassdoor.co.in/employers/?source=gdemployermenu");
//		driver.findElement(By.xpath("//a[text()='Sign In']")).click();

	}

}
