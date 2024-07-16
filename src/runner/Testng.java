package runner;

import java.time.Duration;

import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.baseclass.LoginPom;

public class Testng extends BaseClass{
	@Test(priority = 1)
	public void browserLaunch() {
		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority = 2)
		public void login() throws InterruptedException{
		
		LoginPom lop=new LoginPom();
		sendInput(lop.getName(), "Admin");
		sendInput(lop.getPassword(), "admin123");
		lop.getLogin().click();

}
}

