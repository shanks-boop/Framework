package com.git.hub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GitHubDemo {
	
	
	
	@Test
	public void githubDemo () throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\af\\Videos\\Webdrivers\\chromedriver.exe"); //set the path to where the chrome driver is located
		
		WebDriver driver = new ChromeDriver(); //initialize chrome driver
		
		driver.manage().window().maximize(); //maximize window during runtime
		
		
		driver.get("http://demo.guru99.com/test/newtours/register.php"); //navigate to mercury tours site with GET command
		
		driver.findElement(By.id("fName")).sendKeys("Ron"); //enter first name with sendKeys command
		
		driver.findElement(By.id("lName")).sendKeys("Silvers"); //enter last name with sendKeys command
		
		driver.findElement(By.id("phone")).sendKeys("678-909-5969"); //enter phone with sendKeys command
		
		driver.findElement(By.id("email")).sendKeys("rsilvers@gmail.com"); //enter email with sendKeys command
		
		driver.findElement(By.id("address")).sendKeys("99 Fake St"); //enter address with sendKeys command
		
		driver.findElement(By.id("city")).sendKeys("Atlanta"); //enter city with sendKeys command
		
		driver.findElement(By.id("state")).sendKeys("GA"); //enter state with sendKeys command
		
		driver.findElement(By.id("zip")).sendKeys("30350"); //enter postal code with sendKeys command
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("UNITED STATES"); //use 'Select' statement to select UNITED STATES from drop down menu on mercury tours website
		
		
		driver.findElement(By.id("user")).sendKeys("defLeppard1"); //enter username with sendKeys command
		
		driver.findElement(By.id("pswd")).sendKeys("inveniemProject"); //enter password with sendKeys command
		
		driver.findElement(By.id("confirmPswd")).sendKeys("inveniemProject"); //enter confirm password with sendKeys command
		
		driver.findElement(By.id("submit")).click(); //click on the 'Submit Query' button using the CLICK() command
		
		Thread.sleep(4000); //wait for the Next Page to load (ideally would use another wait command like 'wait for element to be visible')
		
		driver.findElement(By.id("singIn")).click(); //click on the 'Sign In' button using the CLICK() command
		
		Thread.sleep(4000); //wait for the Next Page to load (ideally would use another wait command like 'wait for element to be visible')
		
		driver.findElement(By.id("user")).sendKeys("defLeppard1"); //enter username with sendKeys command
		
		driver.findElement(By.id("pswd")).sendKeys("inveniemProjec’"); //enter password with sendKeys command
		
		driver.findElement(By.id("submit")).click(); //click on the 'Submit' button using the CLICK() command
		
		Thread.sleep(4000); //wait for the Next Page to load (ideally would use another wait command like 'wait for element to be visible')
		
		String storeLoginMessage = driver.findElement(By.id("submit")).getText(); //store the text 'successful login'
		
		storeLoginMessage.equalsIgnoreCase("successful login"); //make sure that the message 'successful login' is displayed after logging in  - aka - EXPECTED RESULT
		
		
		
	}
	
	
	

}
