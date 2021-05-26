package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSlectors {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
		// driver.findElement(By.cssSelector("input#pass")).sendKeys("neww");

		// driver.findElement(By.cssSelector("input[class='inputtext _55r1
		// _6luy']")).sendKeys("neww");
		// driver.findElement(By.cssSelector("button[='u_0_d_3e']")).click();
		// driver.findElement(By.cssSelector("button[name='login'][type='submit']")).click();
		// driver.findElement(By.cssSelector("button[data-testid^='roy']")).click();
		// driver.findElement(By.cssSelector("button[data-testid$='button']")).click();
		// driver.findElement(By.cssSelector("button[data-testid*='tto']")).click();
		// driver.findElement(By.cssSelector("button[class*='_6lth ']")).click();
		
		driver.findElement(By.cssSelector("a[href*='facebook']")).click();
		                                                  
	}
}
