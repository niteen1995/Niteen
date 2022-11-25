package readExcelSheet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class trial {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workBook = new XSSFWorkbook("E:\\JAVA practics\\DSR\\Book1.xlsx");
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		System.out.println("Excel row count ="+sheet.getPhysicalNumberOfRows());
		System.out.println("Excel column count ="+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("Excel column count ="+sheet.getRow(5).getPhysicalNumberOfCells());
		
		System.out.println("Excel sheet row total count =" +sheet.getLastRowNum());
		System.out.println("the value in row =" +sheet.getRow(6).getCell(5));  //to get cell value
		
		
		System.out.println("---------------------------------------------------------------");
		
        XSSFSheet sheet1 = workBook.getSheet("Sheet2");
		
		System.out.println("Excel row count ="+sheet1.getPhysicalNumberOfRows());
		System.out.println("Excel column count ="+sheet1.getRow(0).getPhysicalNumberOfCells());
		System.out.println("Excel column count ="+sheet1.getRow(5).getPhysicalNumberOfCells());
		
		System.out.println("Excel sheet row total count =" +sheet1.getLastRowNum());
		


		
		
		
		
//		System.out.println("The path of Excel Sheet ="+System.getProperty("user.dir"));//path
//		String path = System.getProperty("user.dir");
	}

}
