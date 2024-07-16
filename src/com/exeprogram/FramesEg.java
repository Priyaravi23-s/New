package com.exeprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesEg {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
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
		WebElement date = driver.findElement(By.id("RESULT_TextField-2"));
		date.sendKeys("02/11/2000");
        WebElement job = driver.findElement(By.className("drop_down"));
        Select select = new Select(job);
        select.selectByIndex(3);
		
	}
}

