package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
 // @Test
//  public void a() {
//	  String a="test";
//	  String b="test";
//	  org.testng.Assert.assertEquals(a, b,"a and b are not equals TC failed");
//			  
//  }
  
	@Test
	public void b()
	{
		String a="test1";
		String b="test";
		Assert.assertNotEquals(a, b,"a and b are equal");
		
		
	}
  
}
