package readExcelSheet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws IOException {
		System.out.println("Get sheet Row no = "+System.getProperty("user.dir"));  // Getpath
		String path = System.getProperty("user.dir");
		
		XSSFWorkbook workBook = new XSSFWorkbook(path+"\\ReadExcel\\Book1.xlsx");
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		System.out.println("Get sheet Row no = "+sheet.getPhysicalNumberOfRows());
		
		System.out.println("Get sheet Row no = "+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("Get sheet column data on 9th row = "+sheet.getRow(9).getPhysicalNumberOfCells());
		
		System.out.println("Get sheet Row no = "+sheet.getRow(8).getCell(9));
		System.out.println("Get sheet Row no = "+sheet.getRow(6).getCell(15));
		
		System.out.println("Get sheet Row no = "+sheet.getLastRowNum());
		System.out.println("Get sheet Row no = "+sheet.getFirstRowNum());
		System.out.println("Get sheet Row no = "+sheet.getActiveCell());
		
		
		

	}

}
