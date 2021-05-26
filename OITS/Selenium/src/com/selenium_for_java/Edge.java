package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\OITS\\jars\\msedgedriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.manage().window().maximize();
		edgeDriver.get("http://facebook.com");
		edgeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sirija Kasi");

	}

}
