package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData 
{
	public static String valueproperties(String value) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\saina\\eclipse-workspace\\Selenium_Framework\\src\\main\\java\\config\\Configration\\Config.Properties");
		prop.load(file);
		return prop.getProperty(value);
		
	}
	public static String ReadExcel(int row,int clounm) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\saina\\eclipse-workspace\\Selenium_Framework\\Test_Data\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(0).getCell(0).getStringCellValue();
		return value;
	}
	
	
}
