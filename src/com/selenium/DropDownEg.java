package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement country = driver.findElement(By.id("country"));
		Select select=new Select(country);
		boolean coun = select.isMultiple();
		if(coun) {
			System.out.println("It Is Multiple DropDown");
		}else {
			System.out.println("It Is Single DropDown");
		}
		select.selectByIndex(4);
		Thread.sleep(3000);
		select.selectByVisibleText("Australia");
		Thread.sleep(3000);
		select.selectByValue("india");
		Thread.sleep(3000);
		List<WebElement> options = select.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		WebElement colors = driver.findElement(By.id("colors"));
		Select sele =new Select(colors);
		boolean mul = sele.isMultiple();
		if(mul) {
			System.out.println("It Is Multiple DropDown");
		}else {
			System.out.println("It Is Single DropDown");
		}
		sele.selectByIndex(4);
		sele.selectByVisibleText("Blue");
		sele.selectByValue("green");
		Thread.sleep(5000);
		
		List<WebElement> colorname = sele.getOptions();
		for(WebElement colorsname:colorname) {
			System.out.println(colorsname.getText());
			
		}
	
		WebElement firstSelectedOption = sele.getFirstSelectedOption();
		System.out.println("first selected option is:"+firstSelectedOption.getText());
		
		List<WebElement> allSelectedOptions = sele.getAllSelectedOptions();
		for(WebElement allSelectedOption:allSelectedOptions) {
			System.out.println("selected option are:"+allSelectedOption.getText());
			sele.deselectAll();
			sele.selectByVisibleText("Blue");
		}	
	}

}
