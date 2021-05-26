package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoteReact {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/OITS/jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://login.yahoo.com");           
		//driver.findElement(By.id("persistent")).click();
//		driver.findElement(By.cssSelector("input#persistent").click();            
	}

}
