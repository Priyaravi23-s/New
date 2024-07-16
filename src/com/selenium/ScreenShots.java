package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Apple iphone 15pro black");
		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		clk.click();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		File take=new File("./ScreenShots/Amazon.png");
		FileHandler.copy(source, take);
		driver.close();
	
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search1 = driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("BlackSaree");
		WebElement clk1 = driver.findElement(By.id("nav-search-submit-button"));
		clk1.click();
		TakesScreenshot screen1=(TakesScreenshot)driver;
		File source1=screen1.getScreenshotAs(OutputType.FILE);
		File take1=new File("./ScreenShots/Amazon1.png");
		FileHandler.copy(source1, take1);
		driver.close();
		
}
}