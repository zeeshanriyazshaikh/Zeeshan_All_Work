package Testng;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
                                      //Pending possible TestCase:Diff browser,refer TestBse--initialisation,same link un/pwd in new tab,session expired,
		public class SidraTest {
			ChromeDriver driver;
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://sidrastore.in/index.php?route=account/login");
		}
		@DataProvider                            //DATA PROVIDER
		public Iterator<Object[]> sidraData()
		{
			
				ArrayList<Object[]> testdata = SidraUtil.sidraTestData();
			return testdata.iterator();
			
		}
		@Test   ( dataProvider="sidraData"  )                       //Data Driven using Data Provider TEST
		public void loginSidra(String email, String password) throws InterruptedException {
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(password);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
		}
		@Test                                 //1.TITLE TEST
		public void sidraTitleTest() {
		String title = driver.getTitle();
		System.out.println(title); 
		Assert.assertEquals(title, "Sidra Store","title not match"); 
		}
		@Test                                //2.SIDRA LOGO TEST
		public void sidraLogo() {
			boolean b = driver.findElement(By.xpath("/html/body/header/div[2]/div/div[1]/div/a/img")).isDisplayed();
			Assert.assertTrue(b);
		}
		@Test                                  //3.PositiveUnPwd(Valid)--LOGIN TEST
		public void loginSidra() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zee.shaikhcool786@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Khansabaig@1994");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle); 
			Assert.assertEquals(actualTitle, "My Account","title not match");              //HOME PAGE TITLE VALIDATION
			boolean b = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li[1]/a/span")).isDisplayed(); 
			Assert.assertTrue(b);                                                    //HOMEPAGE USERNAME DISPLAY VALIDATION
		}
		@Test
		public void invalidEmPwd() throws InterruptedException              //4.INVALID EM/PWD--LOGIN TEST
		{
			String homeTitle="Sidra Store";
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zeee.shaikhcool786@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kkhansabaig@1994");
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle); 
			Assert.assertEquals(actualTitle, "Account Login","title not match");
			
		
		}
			
			@Test                                                  //5.VALID EMAIL INVALID PASSWORD--LOGIN TEST
			public void validEmailInvalidPwd() throws InterruptedException              
			{
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zee.shaikhcool786@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kkhansabaig@1994");
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Account Login","title not match");
				                                                   }
			@Test                                                  //6.BLANK EMAIL BLANK PASSWORD--LOGIN TEST
			public void blankEmBlankPwd() throws InterruptedException              
			{
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(" ");
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Account Login","title not match");
				boolean b = driver.findElement(By.linkText("Warning: No match for E-Mail Address and/or Password.")).isDisplayed(); 
				Assert.assertTrue(b);
				                                                   }
			@Test                                                  //7.BLANK EMAIL SOME PASSWORD--LOGIN TEST
			public void blankEmailSomePwd() throws InterruptedException              
			{
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kkhansabaig@1994");
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Account Login","title not match");
				                                                   }
		
			@Test                                                  //8.VALID EMAIL BLANK PASSWORD--LOGIN TEST
			public void validEmailBlankPwd() throws InterruptedException              
			{
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zee.shaikhcool786@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(" ");
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Account Login","title not match");
				                                                   }
			@Test                                                  //9.FORGET PASSWORD FEATURE--LOGIN TEST
			public void forgetPwdFeature() throws InterruptedException              
			{
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zee.shaikhcool786@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kkhansabaig@1994");
				driver.findElement(By.linkText("Forgotten Password")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Forgot Your Password?","title not match");
				                                                   }
			@Test                                                  //10.AFTER FORGET PASSWORD FEATURE USER SHOULD ABLE TO LOGIN--LOGIN TEST
			public void afterForgetPwdFeatureLogin() throws InterruptedException              
			{
			driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.linkText("Forgotten Password")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zee.shaikhcool786@gmail.com");
				driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/form/div/div[2]/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Account Login","title not match");
				boolean b = driver.findElement(By.linkText("An email with a confirmation link has been sent your email address.")).isDisplayed(); 
				Assert.assertTrue(b);
				}
			
			@Test                                                  //11.SINGLE SIGN ON--LOGIN TEST(SAVED LOGIN DETAILS ALREADY ON SITE)
			public void singleSignOn() throws InterruptedException              
			{
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "My Account","title not match");
			}
			@Test
			public void validEmDecodePwd() throws InterruptedException              //12.VALID EM/ASTERIKS PWD--LOGIN TEST
			{
				
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zeee.shaikhcool786@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("[B@73c6c3b2");
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle); 
				Assert.assertEquals(actualTitle, "My Account","title not match");
			}
			@Test
			public void navigateBackAccess() throws InterruptedException              //12.NAVIGATE BACK ACCESS--LOGIN TEST
			{
				
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();      // My Account
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click(); //Login
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zeee.shaikhcool786@gmail.com");            // Email
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Khansabaig@1994");                          //Password
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();                  //Login Button
				driver.navigate().back();
				driver.navigate().forward();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle); 
				Assert.assertEquals(actualTitle, "Account Login","title not match");
			}
			@Test
			public void logoutNavigatefwdAccess() throws InterruptedException              //13.LOGOUT NAVIGATE FORWARD ACCESS--LOGIN TEST
			{
				
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();      // My Account
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/ul/div/li[2]/a")).click(); //Login
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("zeee.shaikhcool786@gmail.com");            // Email
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Khansabaig@1994");                          //Password
				driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/input")).click();                  //Login Button
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div[2]/div/ul/li/a/span[1]")).click();
				driver.findElement(By.cssSelector("//a[contains(text(),'Logout')]")).click();
				driver.navigate().back();
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle); 
				Assert.assertEquals(actualTitle, "Account Logout","title not match");
			}
			
			//NON FUNCTIONAL PENING
			
			
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		}



