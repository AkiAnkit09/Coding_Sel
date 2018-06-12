package newpackage;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class mainRun {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis= new FileInputStream("F:\\test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheetAt(1);
		Row rw=sh.getRow(1);
		Cell cm=rw.getCell(1);
		System.out.println(cm+" "+rw);

	}

}
