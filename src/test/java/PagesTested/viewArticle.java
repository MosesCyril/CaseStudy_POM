package PagesTested;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewArticle {

	@FindBy (xpath = "(//a[text() = ' Edit Article'])[1]")
	WebElement edit;
	
	public viewArticle(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void editarticle() throws InterruptedException {
		Thread.sleep(2000);
		edit.click();
		System.out.println("clicked in Successfully");
}
	
}