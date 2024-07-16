package com.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;


public class MiniProject extends BaseClass {
	@Test
	public static void main(String[] args) {
		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		sendInput(search, "Apple iPhone 15 Pro (256 GB) - Black Titanium");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		WebElement select = driver.findElement(By.xpath("(//div[@class='a-section'])[2]"));
		select.click();
//		WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
//		addCart.click();

	}

}
