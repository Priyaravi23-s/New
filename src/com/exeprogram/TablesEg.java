package com.exeprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesEg {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.xpath("//label[text()='Shopping List']"));
		String title = table.getText();
		System.out.println("Table name:"+title);
		WebElement product = driver.findElement(By.xpath("//td[text()='Ice cream']/parent::tr[1]/child::td[6]"));
		String text = product.getText();
		System.out.println("product Cholesterol :"+text);
		product.click();
		
	}

}
