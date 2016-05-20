package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageFactory.AboutPageConstants;
import pageFactory.AlertPageConstants;
import pageFactory.HomePageConstants;
import pageFactory.LeaderShipTeamPage;

public class TC extends CommonLibrary
{
	static String expectedString=null;
	
	/*	
		1)	Go to www.omgeo.com,
			a.	click on “About” tab
			b.	verify that we navigate to the “about Omgeo” page
	 */	
	@Test(priority=1, description="Homp Page")
	public void tc1VerifyAboutPage() throws Exception{
		try{
			String url="http://www.omgeo.com/";
			urlNavigate(url);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END);Thread.sleep(3000);
			
			expectedString= "pressroom";
			verifyTextOnPage(expectedString);
			
			homePageConstantsObj = new HomePageConstants(driver);
			homePageConstantsObj.aboutLink.click();
			Thread.sleep(3000);
			expectedString="What We Bring to the Table";
			verifyTextOnPage(expectedString);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
	
	/*
	 2)	On the “about Omgeo” page
			a.	select the ALERT product from the dropdown to the right (under “Find a Product” section)
			b.	verify that we navigate to the Omgeo ALERT page
	 */
	@Test(priority=2,description="About Page", dependsOnMethods={"tc1VerifyAboutPage"})
		public void tc2VerifyAlertPage() throws Exception {
			try{
				aboutPageConstantsObj = new AboutPageConstants(driver);
				aboutPageConstantsObj.selectDropDown.click();Thread.sleep(3000);
				aboutPageConstantsObj.selectDropDownValue.click();Thread.sleep(3000);
				expectedString="Omgeo ALERT";
				verifyTextOnPage(expectedString);
		}catch(Exception e){
				e.printStackTrace();
			}
		}

	/*
	 	From the ALERT Omgeo page
		Navigate to the “Leadership Team” page
	*/
	@Test(priority=3,description="Alert Page", dependsOnMethods={"tc2VerifyAlertPage"})
	public void tc3VerifyLeadershipTeamPage() throws Exception {
		try {
			alertPageConstantsObj = new AlertPageConstants(driver);
			alertPageConstantsObj.leadershipTeamLink.click();Thread.sleep(3000);
			expectedString="Our Executive Team";
			verifyTextOnPage(expectedString);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
 		On “Leadership Team” page
		a.	click on a member of the Executive Team
		b.	verify a portion of the text is displayed specific to that member
	 */
	@Test(priority=4,description="Leadership Team Page", dependsOnMethods={"tc3VerifyLeadershipTeamPage"})
	public void tc4VerifyLeaderPage() throws Exception {
		try {
			leaderShipTeamPageObj = new LeaderShipTeamPage(driver);
			leaderShipTeamPageObj.leaderShipTeamSheldonWarrickLink.click();Thread.sleep(3000);
			driver.switchTo().frame(leaderShipTeamPageObj.leaderShipTeamSheldonWarrickiFrame);
			expectedString="Sheldon E. Warrick is Managing Director";
			verifyTextOnPage(expectedString);
	   	}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
