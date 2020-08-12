package ing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class second {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\asus\\Documents\\selenienumexcel.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println("row is:"+row);
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("coloumn:"+col);
for(int i=0;i<row;i++)
{
	XSSFRow ROW=sheet.getRow(i);
	for(int j=0;j<col;j++)
	{
		String value=ROW.getCell(j).toString();
		System.out.print(value+"     ");
	}
	System.out.println();
}
	}

}
