package homepage;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			@FindBy(id="email") 	
			public WebElement username;
			@FindBy(name="pass")
			public WebElement password;
			@FindBy(id="u_0_b")
			public WebElement login;
			
		
		
}

