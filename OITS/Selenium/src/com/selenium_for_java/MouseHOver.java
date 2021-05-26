package com.selenium_for_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHOver {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:/OITS/jars/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
	
		System.setProperty("webdriver.edge.driver", "D:\\OITS\\jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();  
		
	
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Actions dd =new Actions(driver);
		WebElement elem=driver.findElement(By.xpath("//div[text()='Services']"));
		dd.moveToElement(elem).perform();
		Thread.sleep(5000);

	}

}
