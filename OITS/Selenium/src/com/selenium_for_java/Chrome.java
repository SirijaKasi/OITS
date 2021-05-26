package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sirija Kasi");
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("Sirija Kasi");
	}

}
