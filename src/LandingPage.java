

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	//signIn
	@FindBy(xpath="//button[@type='submit']")
	WebElement signInButton;
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(css="a[href='index.html']")
	WebElement logIn;
	
	@Test(dataProvider ="signInDataProvider", priority=2)
	public void SignIn(String userEmail,String userPassword) {
		signInButton.click();
		userName.sendKeys(userEmail);
		passWord.sendKeys(userPassword);
		logIn.click();
	}
		public void isEmailTestPassed(String userEmail) {
			if(userEmail.length() < 3 || userEmail.length() > 20) {
				try {
				assertTrue(logIn.isDisplayed());
				}
				catch(NoSuchElementException ex) {}
			}
			else
				Assert.assertEquals("https://mobileworld.banyanpro.com/index.html", driver.getCurrentUrl());
		}
		
		public void isPasswordTestPassed(String userPassword) {
			if(userPassword.length() < 3 || userPassword.length() > 10) {
				try {
				assertTrue(logIn.isDisplayed());
				}
				catch(NoSuchElementException ex) {System.out.println("Invalid Password");}
			}
			else
				Assert.assertEquals("https://mobileworld.banyanpro.com/index.html", driver.getCurrentUrl());
		}
		
	
		        //SignUp
				@FindBy(css="button[type='submit']")
				WebElement signIn;
				
				@FindBy(css="a[href='signup.html']")
				WebElement signUp;
				
				@FindBy(css="input[placeholder='First Name']")
				WebElement firstName;
				
				@FindBy(css="input[placeholder='Last Name']")
				WebElement lastName;
				
				@FindBy(css="input[placeholder='Enter Email']")
				WebElement Email;
				
				@FindBy(css="input[placeholder='Password']")
				WebElement password;
				
				@FindBy(css="input[type='date']")
				WebElement DOB;
				
				@FindBy(xpath="//*[@id=\"myForm\"]/div[3]/div[4]/input")
				WebElement gen;
				
				@FindBy(css="input[type='number']")
				WebElement Mobnum;
				
				@FindBy(css="textarea[placeholder='Short Bio']")
				WebElement Shortbio;
				
				@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/form[1]/div[6]/div[2]/button[1]")
				WebElement register;
				
		@Test(dataProvider = "signUpDataProvider", priority=1)
		public void SignUp(String fname,String lname,String email,String pwd,String dob,String num,String bio) throws InterruptedException {
				
					signIn.click();
					signUp.click();
					firstName.sendKeys(fname);
					lastName.sendKeys(lname);
					Email.sendKeys(email);
					password.sendKeys(pwd);
					DOB.sendKeys(dob);
					gen.click();
					Mobnum.sendKeys(num);
					Shortbio.sendKeys(bio);
					register.click();
			        driver.switchTo().alert().accept();
				}
					
		//order
		@FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
		WebElement support;
		
		@FindBy(css="a[href='order.html']")
		WebElement order;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
		WebElement firstName1;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")
		WebElement lastName1;
		
		@FindBy(xpath="//input[@id='inputEmail']")
		WebElement Email1;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]")
		WebElement password1;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]")
		WebElement gen1;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/input[1]")
		WebElement Mobnum1;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")
		WebElement Address1;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]")
		WebElement Address2;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]")
		WebElement cityfield;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/select[1]")
		WebElement choose;
		
        @FindBy(xpath="//*[@id=\"inputState\"]/option[3]")
		WebElement statefield;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[3]/input[1]")
		WebElement zipcode;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")
		WebElement choosebrand;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
		WebElement brandname;
		
        @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/div[1]/select[1]/option[2]")
		WebElement choosemodel;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]")
		WebElement count;
		
		@FindBy(xpath="//*[@id=\"bought\"]/option[2]")
		WebElement Buystatus;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/input[1]")
		WebElement correctadd;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[9]/div[2]/input[1]")
		WebElement correctmb;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button[1]")
		WebElement orderbtn;
		
       @Test(dataProvider ="orderDataProvider", priority=3)		
       public void order(String fname,String lname,String email,String pwd,String num,String add1,String add2,String city,String zip,String cnum) throws InterruptedException {
			
			support.click();
			order.click();
			Set windows = driver.getWindowHandles(); 
			Iterator it = windows.iterator();
			String parentId = (String) it.next(); 
			String childId = (String) it.next();
			driver.switchTo().window(childId);
			
			firstName1.sendKeys(fname);
			lastName1.sendKeys(lname);
			Email1.sendKeys(email);
			password1.sendKeys(pwd);
			gen1.click();
			Mobnum1.sendKeys(num);
			Address1.sendKeys(add1);
			Address2.sendKeys(add2);
			cityfield.sendKeys(city);
			choose.click();
			statefield.click();
			zipcode.sendKeys(zip);
			choosebrand.click();
			brandname.click();
			choosemodel.click();
			count.sendKeys(cnum);
			Buystatus.click();
			correctadd.click();
			correctmb.click();
			orderbtn.click();
			Thread.sleep(1000);
			driver.close();
			}
}


