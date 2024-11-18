package PagesTested;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArticle {
		@FindBy (xpath = "//input[@placeholder='Article Title']")
		WebElement atitle;
		@FindBy (xpath = "//input[@name='description']")
		WebElement about;
		@FindBy (xpath = "//textarea[@rows='8']")
		public WebElement acontent;
		@FindBy (xpath = "//button[contains(text(),'Publish')]")
		public WebElement publish;
		public NewArticle(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		public void textenter(String tit, String desc, String act) {
			// TODO Auto-generated method stub
			atitle.sendKeys(tit);
			about.sendKeys(desc);
			acontent.sendKeys(act);
			publish.click();
	
		}
}

