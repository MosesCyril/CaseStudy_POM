package PagesTested;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath = "//a[@class ='nav-link ']")
	WebElement nartle;
	
	
public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void newarticle() throws InterruptedException {
	Thread.sleep(2000);
	nartle.click();
	System.out.println("clicked in Successfully");
}

}
