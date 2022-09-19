//package utilities;
//
//import java.io.FileInputStream;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.DataFormatter;
//
//public class XLUtils {
//
//	public static FileInputStream fi ;
//	public static FileOutputStream fo;
//    public static XSSFWorkbook wb ;
//    public static XSSFSheet ws;
//    public static XSSFRow row;
//    public static XSSFCell cell;
//    
//    public static int getRowCount(String xlfile,String xlsheet) throws IOException {
//    
//    	fi = new FileInputStream(xlfile);
//    	ws =new XSSFWorkbook(fi);
//    	ws= wb.getSheet(xlsheet);
//    	int rowcount =ws.getLastRowNum();
//    	wb.close();
//    	fi.close();
//     	return rowcount;
//    	 }
//    
//    public static int getCellCount(String xlfile,String xlsheet,int rownum) {
//    	
//     
//   	fi = new FileInputStream(xlfile);
//    	ws =new XSSFWorkbook(fi);
//    	ws= wb.getSheet(xlsheet);
//    	row = ws.getRow(rownum);
//    	int cellcount =ws.getLastCellNum();
//    	wb.close();
//    	fi.close();
//    	return cellcount;
//   
// 
//    	public static  String getCellData(String xlfile,String xlsheet,int rownum,int column)	{
//              
//    		fi = new FileInputStream(xlfile);
//    		ws =new XSSFWorkbook(fi);
//    		ws= wb.getSheet(xlsheet);
//    		row = ws.getRow(rownum);
//    	    cell=row,.getCellData;
//    	    String data;
//    	    try {
//    	    	DataFormatter formatter = new DataFormatter();
//    	    	String cellData = formatter.formatCellValue(cell);
//    	    	 return cellData;
//    	    	 }
//    	    catch (Exception e) {
//    	          data="";
//    	    	  }
//    	    wb.close;
//    	    fi.close();
//    	  return data;
//    	}	
// 
//    	public static String setCellData(String xlfile,String xlsheet,int rownum,int column,String data) {
//    		fi = new FileInputStream(xlfile);
//    		wb = new XSSFWorkbook(fi);
//    		ws= wb.getSheet(xlsheet);
//    		row = ws.getRow(rownum);
//    		cell=row,.getCellData;
//    	    cell.setCellValue(data);
//    	   fo = new FileOutputStream(xlfile);
//    	   wb.write(fo);
//    	   wb.close();
//    	   fi.close();
//    	   fo.close();
//    	
//    	
//    	}
//    }
//	
//}
