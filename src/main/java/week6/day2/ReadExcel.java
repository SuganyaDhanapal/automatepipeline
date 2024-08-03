package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./testdata/CreateLead.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		
				int rowCount = sheet.getLastRowNum();
				System.out.println("Total no:of rows: "+rowCount);
				
				int columnCount = sheet.getRow(0).getLastCellNum();
				System.out.println("Total no:of columns: "+columnCount);
	
				for (int i = 1; i <=rowCount; i++) {
					XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < columnCount; j++) {
						XSSFCell cell = row.getCell(j); //[1][3]
						String data = cell.getStringCellValue();
						System.out.println(data);
					}



	}
	}
}
