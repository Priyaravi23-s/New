package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpeningWebBrowser {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://snapdeal.com/");
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("kidsFrocks");
		boolean displayed = search.isDisplayed();
		System.out.println(displayed);
		boolean enabled = search.isEnabled();
		System.out.println(enabled);
		boolean selected = search.isSelected();
		System.out.println(selected);
		WebElement clk = driver.findElement(By.className("searchTextSpan"));
	    clk.click();
		
	    WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
	    driver1.get("https://www.flipkart.com/");
		WebElement search1 = driver1.findElement(By.name("q"));
		search1.sendKeys("DesignerLehenga");
		boolean displayed1 = search1.isDisplayed();
		System.out.println(displayed1);
		boolean enabled1 = search1.isEnabled();
		System.out.println(enabled1);
		boolean selected1 = search1.isSelected();
		System.out.println(selected1);
		WebElement clk1= driver1.findElement(By.className("_2iLD__"));
	    clk1.click();
		
		
		
		
		
		
		
		
		
		
		//String currentUrl=driver.getCurrentUrl();
		//System.out.println("Current Url:"+currentUrl);
		//String title = driver.getTitle();
		//System.out.println("Title:"+title);
		//String pageSource = driver.getPageSource();
		//System.out.println("Current PageSource:"+pageSource);
		//driver.close();
		
	}

}

