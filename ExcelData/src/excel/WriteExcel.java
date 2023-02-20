package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteExcel {

	public static void main(String[] args) throws IOException {
	

		XSSFWorkbook wb = new XSSFWorkbook();        // we create object of work sheet
		XSSFSheet ws1 = wb.createSheet("my data");   // we connect worksheet to work book 
		XSSFSheet ws2 = wb.createSheet("James bond");

		//Row r0 = ws1.createRow(0); //we don t need it anymore reolaced it bellow
		
		//Cell c0 = r0.createCell(0); we don t need it anymore reolaced it bellow
		
		//ws1.createRow(0).createCell(0).setCellValue("Hello");  // till this line, we are setting up excel// it use to be c0.setCellValue("Hello");
		
		for (int i=0; i<100; i++) {
			ws1.createRow(i).createCell(0).setCellValue("Hello");
		}
		
		ws1.getRow(10).createCell(2).setCellValue("Hello"); // to write in row 11 cell 2 //we use get because we created already the row in for loop
		
		System.out.println(ws1.getPhysicalNumberOfRows());
		System.out.println(ws1.getRow(10).getPhysicalNumberOfCells()); // we have to get row to get number of colomn
		
		
		String path = "data\\PRO.xlsx";    // here we start setting our file to the project // create folder under project first and name it data 
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream (f);
		
		wb.write(fo); // to combine the excel stuff abouve to the file willing to create 
		fo.close();  // to tell the program that we are done 
	}

	}


