package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePack.BaseTest;
import PagesTested.HomePage;
import PagesTested.LoginPage;
import PagesTested.NewArticle;
import PagesTested.viewArticle;


public class NewArticleTest {
	WebDriver driver;
	LoginPage loginpage;
	HomePage hmpage;
	NewArticle nart;
	viewArticle vart;
	
	

	@BeforeTest
	public void Setup() {
		BaseTest.initDriver();
		
		driver = BaseTest.getDriver();
		BaseTest.openURL("https://conduit-realworld-example-app.fly.dev/");
		driver.findElement(By.xpath("//a[@href='#/login']")).click();
		
	}
	
	@Test(priority = 1)
	  public void logintest() {
		loginpage = new LoginPage(driver);
		  loginpage.validlogin("cyril.lj@gmail.com", "jun90@Tcs21");
	  }
	
	@Test(priority = 2)
	  public void hometest() throws InterruptedException {
		hmpage = new HomePage(driver);
		hmpage.newarticle();
		
	  }
	
	@Test(priority = 3)
	  public void articletest() {
		nart = new NewArticle(driver);
		nart.textenter("SelenumQAtest1","how to test" , "selenium framework");
	  }
	@Test(priority = 4)
	  public void editarticle() throws InterruptedException {
		vart = new viewArticle(driver);
		vart.editarticle();
		
		nart.acontent.clear();
		nart.acontent.sendKeys("testqa1");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
		
		
		
		
		
	  }
}

 

