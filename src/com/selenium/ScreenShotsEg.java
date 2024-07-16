package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotsEg {
	static WebDriver driver;
public static void main(String[] args) throws IOException {
	List<String> browserName=new LinkedList<String>();
	browserName.add("chrome");
	browserName.add("Edge");
	for(String drive:browserName) {
		String browser=drive;
		
		if(browser.equals("chrome")){
			driver=new ChromeDriver();
		} else if (browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Apple Iphone 15pro black");
		WebElement enter = driver.findElement(By.id("nav-search-submit-button"));
		enter.click();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		File take=new File("./ScreenShots/AmazonIphone.png");
		FileHandler.copy(source, take);
		
		driver.close();
		
		}
	}
}

