import org.testng.annotations.Test;

public class secondTest {
  @Test(priority=1)
  public void e() {
	  System.out.println("e albhabet");
  }
  @Test(priority=2)
  public void d()
  {
	  System.out.println("a alphabet");
  
  
  }
  @Test(priority=3,dependsOnMethods="d",alwaysRun=true)
  public void c()
  {
	System.out.println("c alphabet");  
  }
  @Test(priority=4)
  public void b()
  {
	  System.out.println("b alphabet");
  }
  @Test(priority=5)
  public void a()
  {
	  System.out.println("a alphabet");
  }
}
