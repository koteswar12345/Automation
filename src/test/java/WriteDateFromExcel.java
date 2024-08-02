import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDateFromExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("C:\\Users\\kotes\\SeleniumJava\\CucumberDemo\\testData\\data1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("5");
		row1.createCell(2).setCellValue("automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Selenium");
		row2.createCell(1).setCellValue("50");
		row2.createCell(2).setCellValue("automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created.....");

	}

}
