package com.exeprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderEg {
	
	public static void main(String[] args) {
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://testautomationpractice.blogspot.com/");
	   WebElement frame = driver.findElement(By.id("frame-one796456169"));
		driver.switchTo().frame(frame);
		WebElement name = driver.findElement(By.className("text_field"));
		name.sendKeys("Sivapriya Bhalaravi");
		WebElement gender = driver.findElement(By.id("RESULT_RadioButton-1_1"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", gender);
	   WebElement calender = driver.findElement(By.xpath("//span[@class='icon_calendar']"));
	   calender.click();
	   WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/child::span"));
	   String text = month.getText();
	   System.out.println("list of month:"+text);
	   
	   while (text.equalsIgnoreCase("August")) {
		   WebElement element = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/child::span"));
		   element.click();		   
		    String text2 = element.getText();
		    System.out.println(text2);
		if(!text.equalsIgnoreCase("November")) {
			break;
		}
	   WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	   Select sele=new Select(year);
	   sele.selectByValue("2000");
	   
	   WebElement date = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]"));
	   date.click();
	   
	   }
	   
	   
	
	}
	

}
