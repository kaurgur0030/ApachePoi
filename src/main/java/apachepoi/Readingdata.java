package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class Readingdata {
public static void main(String[] args) throws IOException {
	String excelfilepath =".\\datafiles\\Student table.xlsx";  // create a file path where it is located
	FileInputStream input = new  FileInputStream(excelfilepath); // to open  this file we use stream class
	XSSFWorkbook workbook = new XSSFWorkbook(input);
	XSSFSheet sheet = workbook.getSheetAt(0); // to get sheet
	// Iterator most approachable concept
	 Iterator iterator = sheet.iterator();
	 while (iterator.hasNext()) {
		XSSFRow row   = (XSSFRow ) iterator.next(); // it will return all the rows 
		Iterator cell = row.cellIterator(); // to capture all the cells
		while (cell.hasNext()) {
			XSSFCell c = (XSSFCell) cell.next(); //return all the cells
			switch (c.getCellType()) {
			case STRING: System.out.print(c.getStringCellValue()); break;
			case NUMERIC: System.out.print(c.getNumericCellValue()); break;
			
				
			case BOOLEAN: System.out.print(c.getBooleanCellValue()); break;
			
			}
			System.out.print(" | ");
			
			
		}
		System.out.println();
		
	}
	
}

	}


