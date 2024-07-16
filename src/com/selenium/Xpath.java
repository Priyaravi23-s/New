package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement name = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		name.sendKeys("SivaPriyaBhalaravi");
		WebElement email = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	    email.sendKeys("Sivapriyaravi28@gmail.com");
	    WebElement phoneno = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
	    phoneno.sendKeys("7402026871");
	    WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control']"));
	    address.sendKeys("2/58b,NorthStreet,K.Thenpathi,Chidhambaram,Cuddalore");
	    WebElement colour = driver.findElement(By.xpath("//label[@for='colors']"));
	    String text = colour.getText();
	    System.out.println("Text From Text Path:"+text);
	    WebElement clo = driver.findElement(By.xpath("//option[@value='blue']"));
	    String text2 = clo.getText();
	    System.out.println("Text From Text Path:"+text2);
	    clo.click();
	    WebElement search = driver.findElement(By.xpath("//input[contains(@class,'wikipedia')]"));
	    search.sendKeys("Panda");
	    WebElement clk = driver.findElement(By.xpath("//input[contains(@class,'button')]"));
	    clk.click();
	   
	    
	
	
	
	}

}
