package com.project;


import java.time.Duration;

import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.baseclass.LoginPom;

public class LoginDemo extends BaseClass{
	
	
	@Test
	public void browserlaunch() {
		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPom lop=new LoginPom();
		sendInput(lop.getName(), "Admin");
		sendInput(lop.getPassword(), "admin123");
		lop.getLogin().click();
	}
}
