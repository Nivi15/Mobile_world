import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SignUp {
    @Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nivethaa.e\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup = new LandingPage(driver);
	    sup.SignUp("Nivethaa", "Elumalai" ,"nivethaa1@gmail.com", "Pass1", "03/15/2001", "9934127879", "Hi There");
	    sup.SignUp("NB", "Elumalai" ,"nivethaa.e@qt.com", "Pass2", "03/15/2001", "1111111111", "Hi Hello");
        sup.SignUp("NB", "shaa" ,"nivishaa.e@qt.com", "Pass2", "03/15/2001", "1111111111", "Hi Third");
    }
}
		
	

		

	


