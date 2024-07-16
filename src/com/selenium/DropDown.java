package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dD = driver.findElement(By.id("searchDropdownBox"));
		Select dselect=new Select(dD);
		
		boolean drop = dselect.isMultiple();
		if(drop) {
			System.out.println("This is Multiple DropDown");
		}else {
			System.out.println("This is Single DropDown");
		}
		List<WebElement> options = dselect.getOptions();
		int size=options.size();
		System.out.println("Size of DropDown:"+size);
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		dselect.selectByIndex(5);
		Thread.sleep(5000);
		dselect.selectByValue("search-alias=apparel");
		Thread.sleep(5000);
		dselect.selectByVisibleText("Health & Personal Care");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Apple Iphone 15 pro Black");
		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();
	}
}
