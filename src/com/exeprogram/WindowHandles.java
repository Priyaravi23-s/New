package com.exeprogram;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/windows");
		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();
		
		WebElement multi = driver.findElement(By.id("multi"));
		multi.click();
		String title=driver.getTitle();
		String parentTab = driver.getWindowHandle();
		System.out.println("Title:"+title+"parentTab id:"+parentTab);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle:windowHandles) {
			driver.switchTo().window(windowHandle);
			System.out.println("Title:"+driver.getTitle());
			System.out.println(driver.getTitle());
			
			if(!windowHandle.equals(parentTab)) {
				driver.close();
			}
		}
		//driver.switchTo().window(parentTab);
	}
}
//if(driver.getTitle().equalsIgnoreCase("LetCode - Testing Hub")) {
//	WebElement inputEdit=driver.findElement(By.xpath("//*[text()='Edit']"));
//	inputEdit.click();
//	driver.close();