package excelFlie;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class CreateExcel {

	public static void main(String[] args) throws IOException {
		
	
		XSSFWorkbook wb = new XSSFWorkbook();        // we create object of work sheet
		XSSFSheet ws1 = wb.createSheet("my data");   // we connect worksheet to work book 
		XSSFSheet ws2 = wb.createSheet("James bond");

		Row r0 = ws1.createRow(0);
		
		Cell c0 = r0.createCell(0);
		
		c0.setCellValue("Hello");  // till this line, we are setting up excel
		
		String path = "data\\PRO.xlsx";    // here we start setting our file to the project
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream (f);
		
		wb.write(fo); // to combine the excel stuff abouve to the file willing to create 
		fo.close();  // to tell the program that we are done 
	}

}
