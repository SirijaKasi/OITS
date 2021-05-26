package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {    

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("welcome");
		// driver.findElement(By.xpath("//a[@class='gb_g']")).click();
//driver.findElement(arg0)
	}

}
