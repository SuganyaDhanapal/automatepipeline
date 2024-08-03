package Marathon3;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataIntegration {
	
	public static String[][] readExcel(String fileName) throws IOException {
		// Open the workbook and mention the file path
		XSSFWorkbook wb = new XSSFWorkbook("./testdata/"+fileName+".xlsx");
		//Enter into a specific sheet by the index / sheetname
		XSSFSheet sheet = wb.getSheetAt(0);
		//get the rowCount
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no:of rows: "+rowCount);
		//get the columnCount
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total no:of columns: "+columnCount);
		
		String[][] data = new String[rowCount][columnCount];	
		
		//iterate through the rows and columns
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j); //[1][3]
				CellType cellType = cell.getCellType();
				String cellVal;
				switch (cellType) {
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						java.util.Date dateVal = cell.getDateCellValue();
						cellVal = dateVal.toString();
					} else {
						double numericVal = cell.getNumericCellValue();
						cellVal = Double.toString(numericVal);
					}
					break;
				case BOOLEAN:
					boolean boolVal = cell.getBooleanCellValue();
					cellVal = Boolean.toString(boolVal);
					break;
				case STRING:
				default:
					cellVal = cell.getStringCellValue();
					break;
				}
				System.out.println(cellVal);
				data[i-1][j]=cellVal;//data[1-1][0]=TestLeaf
			}
			
		}
		
		wb.close();
		return data;
		

	}


}
