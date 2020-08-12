package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
  @Tes
  @Parameters({"first name"})
  public void para(String name) {
	  System.out.println("dddd");
	  System.out.println(name);
	  
	  
  }
}
