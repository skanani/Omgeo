package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageConstants {
	WebDriver driver;
	public @FindBy(xpath="//*[@id='header']/div[2]/div[2]/ul/li[1]/a") WebElement aboutLink;
	
	public HomePageConstants(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
