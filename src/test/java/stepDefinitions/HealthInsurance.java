package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.CoverFox.DriverConfig.Driverfactory;
import com.CoverFox.Pages.CoverFoxAddressDetailsPage;
import com.CoverFox.Pages.CoverFoxHealthPlanPage;
import com.CoverFox.Pages.CoverFoxHomePage;
import com.CoverFox.Pages.CoverFoxMemberDetailspage;
import com.CoverFox.Pages.CoverFoxResultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthInsurance {
	
	CoverFoxHomePage coverFoxHomePage =new CoverFoxHomePage(Driverfactory.getDriver());
	CoverFoxHealthPlanPage coverFoxHealthPlanPage=new CoverFoxHealthPlanPage(Driverfactory.getDriver());
	CoverFoxAddressDetailsPage coverFoxAddressDetailsPage=new CoverFoxAddressDetailsPage(Driverfactory.getDriver()); 
	CoverFoxMemberDetailspage coverFoxMemberDetailspage=new CoverFoxMemberDetailspage(Driverfactory.getDriver());
	CoverFoxResultPage coverFoxResultPage=new CoverFoxResultPage(Driverfactory.getDriver());
	SoftAssert softassert=new SoftAssert();
	

	@Given("I am on Home Page")
	public void i_am_on_home_page() {
	    System.out.println("I am on Home Page");
	   
	}

	@When("I click on getStarted button")
	public void i_click_on_get_started_button() throws InterruptedException {
		Thread.sleep(4000);
	System.out.println("I click on getStarted button");
	coverFoxHomePage.getStartedButton();

	}

	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		Thread.sleep(4000);
	    System.out.println("I click on next button");
	    coverFoxHealthPlanPage.nextbutton();
	}

	@Then("matching health Insurance plan should be displyed as {string}")
	public void maching_health_insurance_plan_should_be_displyed_as(String expectedResult) throws InterruptedException {
		Thread.sleep(8000);
		System.out.println("maching health insurance plans should be displayes as "+expectedResult);
		String actualResult=coverFoxResultPage.getmatchingResultNumber();
		Reporter.log("Actual Result is "+actualResult,true);
		softassert.assertEquals(actualResult, expectedResult);
		
	}
	



@When("I provide age as {string} and click on Next button")
public void i_provide_age_as_and_click_on_next_button(String age) throws InterruptedException, EncryptedDocumentException, IOException {
	Thread.sleep(7000);
    System.out.println("age as "+age );
    coverFoxMemberDetailspage.handleAgedropDown(age);
    coverFoxMemberDetailspage.nextButton();
  
}
@When("i provide pincode as {string} , mobNumber as {string} and click on Continue button")
public void i_provide_pincode_as_mob_number_as_and_click_on_continue_button(String pincode, String mobNum) throws InterruptedException, EncryptedDocumentException, IOException {
	Thread.sleep(7000);
	System.out.println("pincode is "+pincode+"mobilr number as"+mobNum);
	coverFoxAddressDetailsPage.enterPinColdfield(pincode);
	coverFoxAddressDetailsPage.enterMobileNumberField(mobNum);
	coverFoxAddressDetailsPage.clickOnContinueButton();
}

@When("I click on Continue button")
public void i_click_on_continue_button() throws InterruptedException {
	Thread.sleep(7000);
    coverFoxAddressDetailsPage.clickOnContinueButton();
    
}

@Then("Validate error message")
public void validate_error_message() throws InterruptedException {
Thread.sleep(8000);
//    String actualPinErrorMsg = coverFoxAddressDetailsPage.getPincodeErrormessage();
//    String actualMobileErrorMsg=coverFoxAddressDetailsPage.getMobileErrormessage();
//	Reporter.log("pincode error msg is "+actualPinErrorMsg,true);
//	Reporter.log("mobole error msg is "+actualMobileErrorMsg,true);
//	String expErrorMsgMob = "Please enter a valid mobile no.";
//	String expErrorMsgPin = "Please enter a valid pincode";
//	softassert.assertEquals(actualPinErrorMsg,expErrorMsgPin,"pincode error msg is not matching");
//	Reporter.log("pin error msg validation is complete",true);
//	softassert.assertEquals(actualMobileErrorMsg,expErrorMsgMob,"mobile error message is not matching");
//	Reporter.log("mobile error msg validation is complete",true);
//	softassert.assertAll();
//	
	
	String actualErrormsgPincode=coverFoxAddressDetailsPage.getPincodeErrormessage();
	System.out.println(actualErrormsgPincode);
	String actualErrormsgMobile=coverFoxAddressDetailsPage.getMobileErrormessage();
	System.out.println(actualErrormsgMobile);
	String expectedErrormsgPincode="Please enter a valid pincode";
	String expectedErrormsgMobile="Please enter a valid mobile no.";
	softassert.assertEquals(actualErrormsgPincode,expectedErrormsgPincode,"Pincode error message is not matching");
	Reporter.log("Pincode error message is matching",true);
    softassert.assertEquals(actualErrormsgMobile,expectedErrormsgMobile,"Mobile no. error message is not matching");
    Reporter.log("Mobile no. error message is matching",true);
    softassert.assertAll();
   
}







}
