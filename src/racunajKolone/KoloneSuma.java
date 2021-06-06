package racunajKolone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KoloneSuma {

	public static void main(String[] args) {

		File f = new File("domaci.xlsx");

		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);

			Double zbir = 0.0;
			for (int i = 0; sheet.getRow(i).getCell(0) != null; i++) {

				Double celija = sheet.getRow(i).getCell(0).getNumericCellValue();
				zbir = zbir + celija;
			}

			System.out.println(zbir);
			wb.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
