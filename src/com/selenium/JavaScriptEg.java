package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEg {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Topdeal = driver.findElement(By.xpath("//div[@id='desktop-5']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",Topdeal );
		js.executeScript("window.scrollBy0", 2000);
		js.executeScript("window.scrollBy0",-1000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("document.getElementById('twotabsearchtextbox').value= 'Black Saree'");
		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click();", clk);	
		js.executeScript("history.go(0)");
	    String sText = js.executeScript("return document.title;").toString();
		System.out.println("tittle name:"+sText);
		String URL = js.executeScript("return document.URL;").toString();
		System.out.println("URl name:"+URL);
		js.executeScript("window.location='https://www.flipkart.com/'");
		String texts = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("Get Full Text:"+texts);
		js.executeScript("alert('Search Finished');");
	    
	    
	
	}

}
