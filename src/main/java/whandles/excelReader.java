package whandles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class excelReader {

	public void readExcel() throws IOException {
		
		File file = new File("./excel/ReadExcel.xlsx");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(1).getNumericCellValue());
		System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(2).getCell(1).getNumericCellValue());
	}
	
	
}
