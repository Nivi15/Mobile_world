import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class order {
	

	@Test(description="user can order by entering all valid details in order page")
    public void demo() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
        driver.quit();
        }
	
	@Test(description="user cannot order by entering First Name below 3 characters ")
    public void demo1() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.order("Ni","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
 
 @Test(description="user cannot order by entering First Name above 20 characters")
 public void demo2() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivethabalajishashaaheidii","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by without entering First Name")
 public void demo3() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order(" ","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by entering only with numericals in First Name")
 public void demo4() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("12344567","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by entering only with special characters in First Name")
 public void demo5() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("@#!$%^&*","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by entering combination of alphabets, numericals and special characters in First Name")
 public void demo6() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nive@15","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by entering Last Name below 3 charcters")
 public void demo7() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivethaa","El","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering Last Name above 20 characters")
 public void demo8() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalaibalajigovindhan","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by without entering Last Name")
 public void demo9() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha"," ","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering only with numericals in Last Name")
 public void demo10() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","1234556","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering only with special characters in Last Name")
 public void demo11() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","@#!$%^&*","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering combination of alphabets, numericals and special characters in Last Name")
 public void demo12() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai@15","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
     String expected="https://qualicoach.org/mwapp/order.html";
     Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 
 @Test(description="user cannot order by entering invalid email id")
 public void demo13() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abcgmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by without entering email id")
 public void demo14() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai"," ","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 
 @Test(description="user cannot order by entering special characters in password")
 public void demo15() throws InterruptedException{
 // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15@!#","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
     }
 
 @Test(description="user cannot order by entering password below 3 alphanumericals")
 public void demo16() throws InterruptedException{
 // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","N15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering password above 10 alphanumericals")
 public void demo17() throws InterruptedException{
 // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivethaabalaji15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot signup by entering password only with alphabets")
 public void demo18() throws InterruptedException{
 // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivethaa","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot signup by entering password only with numericals")
 public void demo19() throws InterruptedException{
 // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","2345678","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot signup by entering without password")
 public void demo20() throws InterruptedException{
 // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com"," ","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/order.html";
        Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot register by entering 9 numericals in the mobile number")
 public void demo21() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","123456789","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }

 @Test(description="user cannot order by entering alphabets in the mobile number")
 public void demo22() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","123456789e","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }

 @Test(description="user cannot register by without entering mobile number")
 public void demo23() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15"," ","115","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering special characters in the address field1")
 public void demo24() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","!@##$$%%^","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot register by without entering address field1")
 public void demo25() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15"," 9876543210"," ","Shri Dhatrik Pg","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering special characters in the address field2")
 public void demo26() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","!@#$%^&*","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot register by without entering address field2")
 public void demo27() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15"," 9876543210","115"," ","Bangalore","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering special characters in the city text field")
 public void demo28() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","!@#$%^&*","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering invalid city name in the city text field")
 public void demo29() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","trivendrum","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering numericals in the city text field")
 public void demo30() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","12345678","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering without city name in the city text field")
 public void demo31() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg"," ","540065","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering alphabets in the zip code field")
 public void demo32() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","mmkhgbji","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering special characters in the zip code field")
 public void demo33() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","!@#$%^&*","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering without zip code in the zip code field")
 public void demo34() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore"," ","1");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
 
 @Test(description="user cannot order by entering alphabets in number of times")
 public void demo35() throws InterruptedException{
     // TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://qualicoach.org/mwapp/index.html");
     LandingPage sup=new LandingPage (driver);
     sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","nmkhgfhj");
     String actual="driver.getCurrentURL";
         String expected="https://qualicoach.org/mwapp/order.html";
         Assert.assertEquals(actual, expected);
     driver.quit();
 }
     
     @Test(description="user cannot order by entering special characters in number of times")
     public void demo36() throws InterruptedException{
         // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.get("https://qualicoach.org/mwapp/index.html");
         LandingPage sup=new LandingPage (driver);
         sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","!@#$%^%^");
         String actual="driver.getCurrentURL";
             String expected="https://qualicoach.org/mwapp/order.html";
             Assert.assertEquals(actual, expected);
         driver.quit();
     }
     
     @Test(description="user cannot order by without entering in number of times")
     public void demo37() throws InterruptedException{
         // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.get("https://qualicoach.org/mwapp/index.html");
         LandingPage sup=new LandingPage (driver);
         sup.order("Nivetha","Elumalai","abc@gmail.com","Nivi15","1234567890","115","Shri Dhatrik Pg","Bangalore","540065"," ");
         String actual="driver.getCurrentURL";
             String expected="https://qualicoach.org/mwapp/order.html";
             Assert.assertEquals(actual, expected);
         driver.quit();
     }
 }
 

