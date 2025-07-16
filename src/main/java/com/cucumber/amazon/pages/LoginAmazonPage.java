package com.cucumber.amazon.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginAmazonPage {
	
	
	
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Sample Project\\Amazon_UI_Automation\\src\\test\\resources\\drivers\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    
	    WebElement lnk1= driver.findElement(By.xpath("//*[@id='nav-link-accountList']/a"));
	    
	  //  driver.wait(5000);
	    Actions actions = new Actions(driver); 
	    
	    actions.moveToElement(lnk1).perform();
	    
	   // driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[1]")).click();
	    
	    driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']")).click();
	    
	    
	    driver.findElement(By.xpath("rishabh890@")).sendKeys("");
	    driver.findElement(By.xpath("")).sendKeys("abc@123");
	    
	    System.out.println("success");
	}

}

