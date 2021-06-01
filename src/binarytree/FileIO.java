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
	
	void displaySpecial(int i) {
		
		String name=StringReadCellData(i, 0);
		String chemicalSymbol=StringReadCellData(i, 1);
		String block=StringReadCellData(i, 4);
		String group=StringReadCellData(i, 3);
		
		double atomicMass=(float) IntReadCellData(i, 6);
		int atomicNo=(int) IntReadCellData(i, 2);
		
		String crystal=StringReadCellData(i, 5);
		String shell=StringReadCellData(i, 7);
		String orbitals=StringReadCellData(i, 8);
		String pronounce=StringReadCellData(i, 32);
		String nameOrigin=StringReadCellData(i, 33);
		String description=StringReadCellData(i, 34);
		String sources=StringReadCellData(i, 38);
		String discoveredBy=StringReadCellData(i, 35);
		String location=StringReadCellData(i, 37);
		String uses=StringReadCellData(i,39);

		
		
		
		System.out.println(name+ " ("+chemicalSymbol+")				Pronounciation-"+pronounce
				+ "\n Group- "+group+"          Block- "+block
				+ "\n Atomic Number-"+ atomicNo+ "\n Atomic Mass-"+ atomicMass);
		System.out.println("\nDescription- "+description);

		System.out.println("\nShells-  "+shell+"\nOrbitals-"+orbitals);
		System.out.println("Name origin- "+nameOrigin);

		try{
			int year=(int) IntReadCellData(i,36);
			System.out.println("\nDiscovered by- "+discoveredBy+"    Location- "+location+"    Year-"+year);

		}
		catch(IllegalStateException E){
			String year=StringReadCellData(i, 36);
			System.out.println("\nDiscovered by- "+discoveredBy+"    Location- "+location+"    Year-"+year);

		}
		
		System.out.println("\nSources- "+sources);
		System.out.println("\n Uses- "+uses);
	}
}
