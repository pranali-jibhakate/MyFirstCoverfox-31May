package assertionStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	  Reporter.log("Test a",true);
  }
  @Test
  public void b()
  {
	  Reporter.log("test b",true);
  }
  @Test
  public void c()
  {
	  Reporter.log("test c",true);
  }

}
