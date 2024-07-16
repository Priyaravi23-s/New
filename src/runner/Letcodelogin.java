package runner;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.baseclass.LoginPom;

public class Letcodelogin extends BaseClass {
	
	@DataProvider(name="data connecter")
	private String[][] getValue() {
		String[][] data=new String[2][2];
		data[0][0]="sivapriyaravi28@gmail.com";
		data[0][1]="Priyaravi23";
		data[1][0]="priyaravi23@gmail.com";
		data[1][1]="pk@23";	
		return data;	
	}
	@BeforeTest
	private void launchBrowser() {
		
		launchBrowser("chrome");
		launchUrl("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	@Test(dataProvider = "data connecter")
	
	private void letLogin (String lemail,String lPass) {
		
		LoginPom lp=new LoginPom();
		sendInput(lp.getlEmail(), lemail);
		sendInput(lp.getIpass(), lPass);
		lp.getLlogin().click();	
	}
	@AfterTest
	private void browserQuit() {
		driver.quit();
	}

}
