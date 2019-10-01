package Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LendoExcel {

	public static void main(String[] args) throws IOException {
	
	
	try {
		
	  File arquivo = new File("C:\\Users\\Família\\eclipse-workspace\\Open-Excel-File\\teste2.xlsx");
	  FileInputStream arquivoPlanilha = new FileInputStream(arquivo);
	  
	  //cria um workbook = planilha com todas as abas
	  XSSFWorkbook workbook = new XSSFWorkbook(arquivoPlanilha);
	  
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  
	  //retorna todas as linhas da planilha 0
	  Iterator<Row> rowIterator = sheet.iterator();
	  
	  //varre todas as linhas da planilha
	  while(rowIterator.hasNext()) { //enquanto tiver um elemnto próximo
		  
		  //recebe cada linha da planilha
		  Row linha = rowIterator.next();
		  
		  //pegou todas as células da linha
		  Iterator<Cell> cellIterator = linha.iterator();
		  
		  //varrera todas as células da linha atual
		  while(cellIterator.hasNext()) { 
	          
			  //criou uma célula 
			  Cell celula = cellIterator.next();
			  
			  switch(celula.getCellType()) {
			     case Cell.CELL_TYPE_STRING:
			    	 System.out.println("TIPO STRING: " + celula.getStringCellValue());
			     break;
			     case Cell.CELL_TYPE_NUMERIC:
			    	 System.out.println("Tipo numérico: " + celula.getNumericCellValue());
			     break;
			     case Cell.CELL_TYPE_FORMULA:
			    	 System.out.println("Tipo fórmula: " + celula.getCellFormula());
			     break;
			  } 
		  }
	  }
	  
	 } catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}	
	
	}

}
