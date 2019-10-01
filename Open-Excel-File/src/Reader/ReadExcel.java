package Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	

	public static void main(String[] args) throws IOException {
		
	File arquivoExcel = new File("C:\\Users\\Família\\eclipse-workspace\\Open-Excel-File\\teste.xlsx");
	FileInputStream file = new FileInputStream(arquivoExcel); 
    
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	Iterator<Row> rowIt = sheet.iterator();
	
	 while(rowIt.hasNext()) {
		
		Row row = rowIt.next();
		
		Iterator<Cell> cellInterator = row.cellIterator();
		
		while(cellInterator.hasNext())
		{
			Cell cell = cellInterator.next();
			System.out.println(cell.toString() + " - ");
		}
		System.out.println();
		
	
	
	}
	
	
  
	  file.close();
	}

}

	