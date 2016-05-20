package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageFactory.AlertPageConstants;
import pageFactory.HomePageConstants;
import pageFactory.AboutPageConstants;
import pageFactory.LeaderShipTeamPage;


public class CommonLibrary { 
	WebDriver driver;
	public static HomePageConstants  	homePageConstantsObj;
	public static AboutPageConstants  	aboutPageConstantsObj;
	public static AlertPageConstants 	alertPageConstantsObj;
	public static LeaderShipTeamPage	leaderShipTeamPageObj;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//Navigate/Launch url
	public void urlNavigate(String url) throws Exception{
		try{
			driver.manage().deleteAllCookies();
			driver.navigate().to(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	  
	//Verifying text on webpage 
	public void verifyTextOnPage(String expectedString) throws Exception{
		try{
			if(driver.getPageSource().contains(expectedString)){
				System.out.println("Text is present ----->"+ expectedString);
			}else {
				System.out.println("Text is absent ---->" + expectedString);
			}
		}catch (Exception e) {
			System.out.println(e);
			}
	}
	
	@AfterTest
	public void TearDown(){ 
		driver.quit();
	}
}
