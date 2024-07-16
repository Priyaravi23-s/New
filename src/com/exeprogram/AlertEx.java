package com.exeprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement miniTv= driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
	miniTv.getText();
	System.out.println("text:"+miniTv.getText());
	miniTv.click();
	driver.navigate().back();
	WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
	sell.getText();
	System.out.println("text:"+sell.getText());
	sell.click();
	driver.navigate().back();
	WebElement best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	best.click();
	driver.navigate().back();
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	mobile.click();
	driver.navigate().back();
	WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
	fashion.getText();
	System.out.println("text:"+fashion.getText());
	fashion.click();
	driver.navigate().back();
	driver.navigate().refresh();
	
	
}
}
