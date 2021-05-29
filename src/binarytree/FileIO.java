package binarytree;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  


public class FileIO {
	Workbook wb=null; 
	Sheet property1=null;		   //getting the XSSFSheet object at given index  

	
	FileIO(){
		try  {  
			FileInputStream fis=new FileInputStream("elements.xlsx");  
			wb=new XSSFWorkbook(fis);  
			property1=wb.getSheetAt(0);	
		}  
		catch(FileNotFoundException e)  {  
			e.printStackTrace();  
		}  
		catch(IOException e1)  {  
			e1.printStackTrace();  
		}  
	}
	
	
	String StringReadCellData(int vRow, int vColumn)  {  
		String value=null;          //variable for storing the cell value  

		Row row=property1.getRow(vRow); //returns the logical row  
		Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
		
		value=cell.getStringCellValue();    //getting cell value  
		return value;               //returns the cell value  
	}  
	
	double IntReadCellData(int vRow, int vColumn)  {  
		double value=0;          //variable for storing the cell value  

		Row row=property1.getRow(vRow); //returns the logical row  
		Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
		
		value=cell.getNumericCellValue() ;
		return value;               //returns the cell value  
	} 
}
