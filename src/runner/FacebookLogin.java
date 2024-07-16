package runner;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.baseclass.LoginPom;

public class FacebookLogin extends BaseClass {
	@Test(priority = 1)
	private void browserLaunch() {	
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
     @DataProvider(name="data connecter")
	private String[][] getValue() {
		String[][] data=new String[2][2];
		data[0][0]="sivapriyaravi28@gmail.com";
		data[0][1]="Priyaravi23";
		data[1][0]="priyaravi23@gmail.com";
		data[1][1]="pk@23";	
		return data;	
	}
     @Test(priority = 2,dataProvider = "data connecter")
 	private void login(String email,String password) {
 		LoginPom lp=new LoginPom();
 		sendInput(lp.getEmail(), email);
 		sendInput(lp.getPasswords(), password);
 		lp.getLoginButon().click();}
     
     @Test(priority=3)
 		public static void quit() {	
 			driver.quit();
 			
 		}
}


