package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {


    public static String readdata(String filepath, String sheetName, int rowNumber, int colNumber) {
        try (FileInputStream file = new FileInputStream(filepath);
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) return "";
            Row row = sheet.getRow(rowNumber);
            if (row == null) return "";
            Cell cell = row.getCell(colNumber);
            if (cell == null) return "";

            return new DataFormatter().formatCellValue(cell);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
