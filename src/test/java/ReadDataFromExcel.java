import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println("Get Row numbers:"+totalRows);
		System.out.println("Get Total Cells:"+totalCells);
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
