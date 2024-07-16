package com.exeprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertEg {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement alert = driver.findElement(By.xpath("//button[text()='Alert']"));
		alert.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirm.click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();
		WebElement promt = driver.findElement(By.xpath("//button[text()='Prompt']"));
		promt.click();
		String text2 = driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().sendKeys("SivaPriyaBhalaravi");
		driver.switchTo().alert().accept();
		
		
       
		
	}

}
