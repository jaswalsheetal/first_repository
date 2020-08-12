package ing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class faceebook_assingment {
	static String path;
	static String pat;
	
	public static void main(String[] args) throws IOException
	{
		path=System.getProperty("user.dir")+"//driver//facebbokassingnment.xlxx";
		pat=System.setProperty("Webdriver.chrome.driver", path);
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println(row);
	}

	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	faceebook_assingment obj = new faceebook_assingment();
		//obj.disp();

	}


