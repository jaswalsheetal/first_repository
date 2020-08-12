package ing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class write_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("C:\\Users\\asus\\Documents\\sheetal_blank.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("data");
		for(int i=0;i<=5;i++)
		{
			XSSFRow roww=sheet.createRow(i);
			for(int j=0;j<=3;j++)
			{
				roww.createCell(4).setCellValue("cvdg");
			}
		}
			book.write(file);
			System.out.println("written");
		

	}

} 	
