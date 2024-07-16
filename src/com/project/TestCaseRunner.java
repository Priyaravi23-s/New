package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class TestCaseRunner extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		selectByIndex(dropDown, 8);
		selectByText(dropDown, "Health & Personal Care");
		selectByValue(dropDown,"search-alias=apparel");
		getTitle();
		refreshPage();
		navigateTo("https://testautomationpractice.blogspot.com/");
		back();
		close();
		quit();
		
	}
	
	
}
