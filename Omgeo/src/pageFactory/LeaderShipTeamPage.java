package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaderShipTeamPage {
	WebDriver driver;
	public @FindBy(xpath="html/body/div[1]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[5]/td[4]/span/a") WebElement leaderShipTeamSheldonWarrickLink;
	public @FindBy(xpath="//iframe[@src='/page/sheldon-warrick-bio']") WebElement leaderShipTeamSheldonWarrickiFrame;
	
	public LeaderShipTeamPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
