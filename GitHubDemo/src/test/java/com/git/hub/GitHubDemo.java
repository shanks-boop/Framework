package com.git.hub;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitHubDemo {
	
	
	
	@Test
	public void githubDemo () {
		
		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\af\\Videos\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("test" + Keys.ENTER);
		
		
		
		
		
	}
	
	
	

}
