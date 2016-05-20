package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPageConstants{ 
	WebDriver driver;
	public @FindBy(xpath="html/body/div[1]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/div/div/a/span") WebElement selectDropDown;
	public @FindBy(xpath="html/body/div[1]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/div/div/div/ul/li[2]") WebElement selectDropDownValue;
	
	public AboutPageConstants (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
