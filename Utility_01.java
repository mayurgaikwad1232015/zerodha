package POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import configuration.Conf;

public class Utility {
public String readExcelData(int row,int col) throws EncryptedDocumentException, IOException {
FileInputStream ff= new FileInputStream(Conf.excelpath);
Sheet sheet = WorkbookFactory.create(ff).getSheet("Sheet4");
String value = sheet.getRow(row).getCell(col).getStringCellValue();
return value;
}
}