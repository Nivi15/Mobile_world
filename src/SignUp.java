import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SignUp {
    
    @Test(description="user can register by entering valid details in signup page")
    public void demo() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","BNE","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hi");
        driver.quit();
        }
   
    
    @Test(description="user cannot register by entering First Name below 3 characters")
       public void demo1() throws InterruptedException{
           // TODO Auto-generated method stub
           System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
           WebDriver driver= new ChromeDriver();
           driver.get("https://qualicoach.org/mwapp/index.html");
           LandingPage sup=new LandingPage (driver);
           sup.SignUp("Ni","elumalai ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
           String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
           Assert.assertEquals(actual, expected);
           driver.quit();
           }
    
    @Test(description="user cannot register by entering First Name above 20 characters")
    public void demo2() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaabalajishashaaheideii","elumalai ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot register by without entering First Name")
    public void demo3() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp(" ","elumalai ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot register by entering only with numericals in First Name")
    public void demo4() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("1234567","elumalai ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot register by entering only with special characters in First Name")
    public void demo5() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("@#$%^&*","elumalai ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot register by entering combination of alphabets, numericals and special characters in First Name")
    public void demo6() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivi@15","elumalai ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot register by entering Last Name below 3 charcters")
    public void demo7() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","el","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    @Test(description="user cannot register by entering Last Name above 20 characters")
    public void demo8() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","elumalainivethaashashaaheidii","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    @Test(description="user cannot register by without entering Last Name")
    public void demo9() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa"," ","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    @Test(description="user cannot register by entering only with numericals in Last Name")
    public void demo10() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","123456","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    @Test(description="user cannot register by entering only with special characters in Last Name")
    public void demo11() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","@#$%^&*!","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    @Test(description="user cannot register by entering combination of alphabets, numericals and special characters in Last Name")
    public void demo12() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","elumalai@14","nivi@gmail.com","nivi566","15/03/2001","9856742561","Hello");
        String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    
    @Test(description="user cannot register by entering invalid email id")
    public void demo13() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","Balaji","nivigmail","nivi566","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
           Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot register by without entering email id")
    public void demo14() throws InterruptedException{
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","Balaji"," ","nivi566","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
           Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    
    @Test(description="user cannot signup by entering special characters in password")
    public void demo15() throws InterruptedException{
    // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivi!@12","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
           Assert.assertEquals(actual, expected);
        driver.quit();
        }
    
    @Test(description="user cannot signup by entering password below 3 alphanumericals")
    public void demo16() throws InterruptedException{
    // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","n5","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
           Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    @Test(description="user cannot signup by entering password above 10 alphanumericals")
    public void demo17() throws InterruptedException{
    // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://qualicoach.org/mwapp/index.html");
        LandingPage sup=new LandingPage (driver);
        sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivethaa1503","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
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
        sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivethaa","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
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
        sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","123456","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
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
        sup.SignUp("Nivethaa","Balaji","nivi@gmail.com"," ","15/03/2001","9856742561","Hi");
        String actual="driver.getCurrentURL";
           String expected="https://qualicoach.org/mwapp/signup.html";
           Assert.assertEquals(actual, expected);
        driver.quit();
    }
    
    
@Test(description="user cant register by entering invalid date of birth")
public void demo21() throws InterruptedException{
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");
    LandingPage sup=new LandingPage (driver);
    sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivi566","03/15/20356","9856742561","Hi");
    String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
    driver.quit();
}

@Test(description="user cant register by without entering date of birth")
public void demo22() throws InterruptedException{
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");
    LandingPage sup=new LandingPage (driver);
    sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivi566"," ","9856742561","Hi");
    String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
    driver.quit();
}

@Test(description="user cant register by entering 9 numericals in the mobile number")
public void demo23() throws InterruptedException{
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");
    LandingPage sup=new LandingPage (driver);
    sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivi566","03/15/2001","987654329","Hi");
    String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
    driver.quit();
}

@Test(description="user cant register by entering alphabets in the mobile number")
public void demo24() throws InterruptedException{
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");
    LandingPage sup=new LandingPage (driver);
    sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivi566","03/15/2001","987654329e","Hi");
    String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
    driver.quit();
}

@Test(description="user cant register by without entering mobile number")
public void demo25() throws InterruptedException{
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/nivethaa.e/Downloads/chromedriver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");
    LandingPage sup=new LandingPage (driver);
    sup.SignUp("Nivethaa","Balaji","nivi@gmail.com","nivi566","03/15/2001"," ","Hi");
    String actual="driver.getCurrentURL";
        String expected="https://qualicoach.org/mwapp/signup.html";
        Assert.assertEquals(actual, expected);
    driver.quit();
}
}
