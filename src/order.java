import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class order {
    @Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage ord = new LandingPage(driver);
		ord.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","#115","Shri Dhatrik Pg","Bangalore","540065","1");

	}

}
