import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignIn {
	
	@Test(description="user can signin with valid username and password")
    public void signIn() {
        System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage ob= new LandingPage(driver);
        ob.SignIn("Nivethaa","Nivi15");
        driver.quit();
	}
	
	@Test(description="user cant signin by leaving username field empty")
    public void Demo1() {
        System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage ob= new LandingPage(driver);
        ob.SignIn(" ","nivi15");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/sign.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
	
	@Test(description="user cant signin by leaving both username and password field empty" )
    public void Demo2() {
        System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage ob= new LandingPage(driver);
        ob.SignIn(" "," ");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/sign.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
	
	@Test(description="user cant signin by entering less than 3 characters in username")
    public void Demo3() {
        System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage ob= new LandingPage(driver);
        ob.SignIn("Ni","Nivi153 ");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/sign.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
	
	@Test(description="user cant signin by entering more than 20 characters in username")
    public void Demo4() {
        System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage ob= new LandingPage(driver);
        ob.SignIn("NivethaaElumalaishaaheidii","nivi123 ");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/sign.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
	
	
    @Test(description="user cant signin by entering special characters in password")
    public void Demo5() {
        System.setProperty("webdriver.chrome.driver","C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage ob= new LandingPage(driver);
        ob.SignIn("nivethaa","nivi!@");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/sign.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
}

	
	



	
