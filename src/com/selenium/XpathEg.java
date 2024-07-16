package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEg {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
	WebElement search = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	search.sendKeys("7402026871");
	WebElement clk = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		clk.click();  
		
}
}
