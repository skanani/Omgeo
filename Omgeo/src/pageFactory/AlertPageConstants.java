package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPageConstants{ 
	WebDriver driver;
	public @FindBy(css="a[href='/leadership_team']") WebElement leadershipTeamLink;
	
	public AlertPageConstants(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
}
