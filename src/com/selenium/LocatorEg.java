package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEg {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Kids Toys");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("Designer Black Saree");
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		boolean displayed = search.isDisplayed();
		System.out.println("Searched thing is Displayed:"+displayed);
		boolean enabled = search.isEnabled();
		System.out.println("Searched thing is Enabled:"+enabled);
		boolean selected = search.isSelected();
		System.out.println("Searched thing is Selected:"+selected);
			
		
		
		
		
		
	}
	
	

}
