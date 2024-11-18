package BasePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseTest {
	
	public static BaseTest basicreq;
	public static WebDriver driver;
	
	private BaseTest() {
		String stredge = "Edge";
		if(stredge.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
			else if(stredge.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("driver object:"+driver);
		
		
	}
	
	public static void initDriver() {
		if(basicreq == null) {
			basicreq = new BaseTest();
			
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	 public static void openURL (String URL) {
		 driver.get(URL);
	 }
	 
	 public static void teardown() {
		 if(driver!=null)
		 {
			driver.close();
			driver.quit();
		
		 }
		 basicreq = null;
	 }
}
		 
	
