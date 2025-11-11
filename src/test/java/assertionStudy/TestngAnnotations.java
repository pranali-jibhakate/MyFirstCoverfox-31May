package assertionStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.BeforeAll;

public class TestngAnnotations {
  @Test
  public void a_resultValidations() {
	  Reporter.log("a Result validation",true);
  }
  @Test
  public void b_resultValidations() {
	  Reporter.log("b Result validation",true);
  }
  
  @BeforeMethod
  public void provideAddressDetails()
  {
	  Reporter.log("Providing pincode and mobile number",true);
  }
  @AfterMethod
  public void clearBrowserHistory()
  {
	  Reporter.log("clearing browser history",true);
  }
  @BeforeAll
  public void provideMemberDetails()
  {
	  Reporter.log("Providing age ",true);
  }
  @AfterClass
  public void tearDown()
  {
	  Reporter.log("close browser",true);
  }
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("before Test",true);
  }
  
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("after Test",true);
  }
  @BeforeSuite
  public void beforeSuit()
  {
	  Reporter.log("before Suit running",true);
  }
  @AfterSuite
  public void afterSuit()
  {
	  Reporter.log("after Suit running",true);
  }
  
  
  
  
  
}
