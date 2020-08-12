package HOMEPAGE;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.TESTBASE.TESTBASE;

public class HOMEPAGEE extends TESTBASE {

		// TODO Auto-generated constructor stub
	
@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
WebElement admin;
@FindBy(xpath="//*[@id='menu_admin_UserManagement']")
WebElement user;
public HOMEPAGEE() throws IOException {
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}
	
public void homes()
{
	admin.click();
	user.click();
}
	
}

