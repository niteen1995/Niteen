package readExcelSheet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class trial1 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workBook = new XSSFWorkbook("E:\\JAVA practics\\DSR\\Book1.xlsx");
		
		XSSFSheet sheet = workBook.getSheet("Sheet2");
		
		System.out.println("Get Sheet Row no="+sheet.getPhysicalNumberOfRows());
		System.out.println("Get Sheet Row no="+sheet.getRow(10).getCell(9));
		System.out.println("Get Sheet Row no="+sheet.getRow(10).getPhysicalNumberOfCells());
		System.out.println("Get Sheet Row no="+sheet.getFirstRowNum());
		System.out.println("Get Sheet Row no="+sheet.getLastRowNum());
		System.out.println("Get Sheet Row no="+sheet.getRow(12).getPhysicalNumberOfCells());
		

	}

}
