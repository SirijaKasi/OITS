package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Model_Window {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "D:\\OITS\\jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		// -------------Not Working---------------
		// driver.get("https://www.glassdoor.co.in/index.htm");
		// driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		// driver.findElement(By.xpath("//button[@type='button']")).click();

		// ------------------Working-------------------
//		driver.get("https://www.glassdoor.co.in/index.htm");
//		driver.findElement(By.xpath("//button[@class='d-none d-lg-block p-0 LockedHomeHeaderStyles__signInButton']"))
//				.click();
		
		// inspect the Sign-In button copy the cssSelector path
		

		// ------------------Working-------------------
//		driver.get("https://www.glassdoor.co.in/employers/?source=gdemployermenu");
//		driver.findElement(By.xpath("//a[text()='Sign In']")).click();

		// -------------Not Working--------------
//driver.get("https://www.glassdoor.co.in/employers/?source=gdemployermenu");
		// driver.findElement(By.xpath("//a[text()='Sign-Up']")).click();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("/div[text()='Login']")).click();
	}
}
