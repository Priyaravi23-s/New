package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFaceBookLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("sivapriyaravi28@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("priya@0211");
		Thread.sleep(5000);
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("priyaravi@2906");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		String text = login.getText();
		System.out.println("text from the path:"+text);
		login.click();
		WebElement fp = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text2 = fp.getText();
		System.out.println("Text From Path:"+text2);
		fp.click();
		WebElement phonenumber = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		phonenumber.sendKeys("7402026871");
		WebElement search = driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		search.click();
		
		
	}

}
