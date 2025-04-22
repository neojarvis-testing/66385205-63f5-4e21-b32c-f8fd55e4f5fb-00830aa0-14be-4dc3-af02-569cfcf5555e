package utils;


import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {


    public static FileInputStream readfile;
    public static XSSFWorkbook fis_Workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell col;

    public static String readdata(String file_path, String sheet_name, int row_num, int col_num) throws IOException {
        try {
            readfile = new FileInputStream(file_path);
            fis_Workbook = new XSSFWorkbook(readfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sheet = fis_Workbook.getSheet(sheet_name);
        row = sheet.getRow(row_num);
        col = row.getCell(col_num);

        String value;
        try {
            DataFormatter dataFormatter = new DataFormatter();
            value = dataFormatter.formatCellValue(col);
            return value;
        } catch (Exception e) {
            value = "";
        }


        fis_Workbook.close();
        readfile.close();


        return value;
    }
}