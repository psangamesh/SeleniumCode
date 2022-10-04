package com.data_driven_testing;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XLUitility 
{

	public FileInputStream Fi;
	public XSSFWorkbook WB;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	String path=null;
	public XLUitility (String path)
	{
		this.path=path;
	}
	public int Get_RoWCount(String sheetname) throws IOException
	{
		Fi= new FileInputStream(path);
		WB=new XSSFWorkbook (Fi);
		sheet=WB.getSheet(sheetname);
	int	rowncount=sheet.getLastRowNum();
		Fi.close();
		WB.close();
		return rowncount;
		
	}
	public int Get_Cell_count(String sheetname, int rownum) throws IOException
	{
		Fi=new FileInputStream(path);
		WB=new XSSFWorkbook (Fi);
		sheet=WB.getSheet(sheetname);
		row=sheet.getRow(rownum);
	int	cellcount=row.getLastCellNum();
		return cellcount;
		
		
	}
	
	public String Get_cell_Data(String sheetname, int rownum, int colnum) throws IOException
	{
		Fi=new FileInputStream(path);
		WB=new XSSFWorkbook(Fi);
		sheet=WB.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter Formatt=new DataFormatter();
		
		String data;
		try {
			data=Formatt.formatCellValue(cell);
		}catch(Exception e)
		{
			data="";
		}
		
		return data;
	}
	
}
