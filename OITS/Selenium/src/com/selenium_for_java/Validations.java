package com.selenium_for_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		String Exp = "Google";
		String act = driver.getTitle();

		if (act.equals(Exp)) {
			System.out.print("title as per expected");
		} else {
			System.out.print("title is not as per expected");
		}
		String currrent = driver.getCurrentUrl();
		if (currrent.startsWith("http")) {
			System.out.print("\n"+"true");
		} else {
System.out.println("false");
		}
	}

}
