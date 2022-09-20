
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SignIn {
	
    @Test
    public void signIn() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
	LandingPage ob = new LandingPage(driver);
	ob.SignIn("nivi05@gmail.com", "Passwd12");
	ob.SignIn("ni", "Pswd23");
	ob.SignIn("nivisha1@gmail.com", "Ps" );
	ob.SignIn("nivi.e@gmail.com", "Password1234");
	}
	}


	
	



	