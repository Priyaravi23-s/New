package com.exeprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionseg {
	
	@Test
	public static void main(String[] args) throws AWTException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		
		driver.get("https://testautomationpractice.blogspot.com/");
	   WebElement alertButton =driver.findElement(By.xpath("//button[text()='Alert']"));
	   act.click(alertButton).perform();
	   String Alerttext = driver.switchTo().alert().getText();
	   System.out.println(Alerttext);
	   driver.switchTo().alert().accept();
	  WebElement textButton= driver.findElement(By.xpath("//button[text()='Copy Text']"));
	  act.doubleClick(textButton).perform();
	  WebElement link = driver.findElement(By.linkText("merrymoonmary"));
	  act.moveToElement(link).perform();
	  WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  act.dragAndDrop(drag, drop).perform();
	  WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/child::span"));
	  act.dragAndDropBy(slider, 150, 0).perform();
	  act.contextClick(link).perform();
	 // act.clickAndHold(slider).perform();
	  
	  Robot robot =new Robot();
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
		
	}

}
