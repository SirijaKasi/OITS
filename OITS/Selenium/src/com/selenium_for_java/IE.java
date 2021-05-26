package com.selenium_for_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\OITS\\jars\\IEDriverServer.exe");
		WebDriver ieDriver = new InternetExplorerDriver();
		ieDriver.get("https:\\www.google.com");
	}

}
