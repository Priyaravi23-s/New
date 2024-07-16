package com.exeprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathExample {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		// search.sendKeys("Black Saree");
		search.sendKeys("Apple IPhone 15 Black ");
		WebElement clk = driver.findElement(By.className("desktop-submit"));
		clk.click();
		
		
		
	}

}

