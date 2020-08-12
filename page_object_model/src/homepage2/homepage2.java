package homepage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage2 {
	public homepage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	public WebElement username;
	@FindBy(id="pass")
	public WebElement password;
	@FindBy(id="u_0_b")
	public WebElement button;
	
	public void txtuser(String user)
	{
		username.sendKeys(user);
	}
public void txtpass(String pass)
{
	password.sendKeys(pass);
}
public void login()
{
	button.click();
}

}
