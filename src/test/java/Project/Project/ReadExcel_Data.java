package Project.Project;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import actions.Actions;
import objectRepo.ObjectRepository;

public class ReadExcel_Data extends Utility
{
	
	String File=path+"\\ReadDatasample.xlsx";
	
	@Test
	public void readData() throws Exception 
	{
		try 
		{
		FileInputStream Fis= new FileInputStream(File);
		Workbook WB= new XSSFWorkbook(Fis);
		Sheet sheet=WB.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String values=cell.getStringCellValue();
		System.out.println("This is excel sheet cell value "+values);
		
		Row row1=sheet.getRow(0);
		Cell cell1=row1.getCell(1);
		String next_value=cell1.getStringCellValue();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ "+next_value);
		
		
		Actions.click(ObjectRepository.userName, "Clicked on Username");
		Actions.sendKeys(ObjectRepository.userName, values, "Entered UserName in text box");
		
		Actions.pause(5);
		
		Actions.click(ObjectRepository.passWord, "Clicked on Password text box");
		Actions.sendKeys(ObjectRepository.passWord, next_value, "Entered password value");
		
		Actions.pause(5);
		
		Actions.click(ObjectRepository.signIn, "Clicked on Sign in button");
		
		
		
		}
		catch(Exception e) 
		{
			throw e;
							 
		}
	}
}
