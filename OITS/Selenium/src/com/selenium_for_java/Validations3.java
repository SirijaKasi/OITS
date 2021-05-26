package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

public class Validations3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:/OITS/jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://crowdsprint.com/tester-signup/");

//		boolean status = driver.findElement(By.id("termsOfService")).isSelected();
//		System.out.println(status);
//		if (status == false) {
//			System.out.println("Check Box Not Selected");
//		} else {
//			System.out.println("CheckBox already Selected");
//		}

		boolean staus = driver.findElement(By.id("termsOfService")).isDisplayed();
		if (isenabled())
			System.out.println("true");

	}

	private static boolean isenabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
