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
	            "C:\\Users\\af\\Videos\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.webstaurantstore.com/"); //navigate to web store
		
		driver.findElement(By.id("searchval")).sendKeys("stainless work table" + Keys.ENTER); //search for item
		
		Thread.sleep(4000); //ideally should use a proper wait command .. like wait for for element to be visible or clickable (using a short cut due to time constraints .. sorry!)
		
		List<WebElement> elementName = driver.findElements(By.xpath("//a[@data-testid='itemDescription']"));
		
		System.out.println(elementName.size());
		
		int i = 1;
		
		//check all the 60 links if they contain the word Table.  There should be a number 60 in the console for the LAST line
		for (WebElement webElement : elementName) {
            String name = webElement.getText();
            //System.out.println(name);
            
            if (name.contains("Table"))
              System.out.println("The list contains Table .. whoohooo" + " " + i);
          else
              System.out.println("UH OH");
            
            i++;
            
        }
		
		Thread.sleep(4000);  //ideally should use a proper wait command
		
		WebElement element = driver.findElement(By.xpath("(//a[@data-testid='itemDescription'])[60]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); //scroll the last item into view to click on it
		
		driver.findElement(By.xpath("(//a[@data-testid='itemDescription'])[60]")).click(); //click on the last item in the list
		
		
		Thread.sleep(4000);   //ideally should use a proper wait command
		
		driver.findElement(By.id("buyButton")).click(); //click on buy button to add item to cart
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@data-testid='cart-nav-link']")).click(); //click on cart to see items
		
		Thread.sleep(4000);   //ideally should use a proper wait command
		
		driver.findElement(By.cssSelector("svg.itemDelete__icon")).click(); //click to empty cart
		
		
	}
	
	
	

}
