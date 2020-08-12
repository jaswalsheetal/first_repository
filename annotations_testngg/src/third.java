import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;
public class third {
 



@Test(dataProvider = "getdata")
  public void DataMatrix(String username,String password,int num,String chrome) 
  {
  }
  
  

  @DataProvider
 public Object[][]getdata()
 {
	  Object[][] data=new Object[3][4];
	   data[0][0]="username1";
	   data[0][1]="password1";
	   data[0][2]="9807557";
	   data[0][3]="mozilla";
	   
	   data[1][0]="username2";
	   data[1][1]="password2";
	   data[1][2]="980755787";
	   data[1][3]="safari";
	   
	   data[2][0]="username3";
	   data[2][1]="password3";
	   data[2][2]="9807557";
	   data[2][3]="goooglr";
	   
	  
	return data;
    }
  }
