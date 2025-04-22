package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static FileInputStream file;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileOutputStream fileout;
	public static XSSFRow row;
	public static XSSFCell col;
	public static int rowvalue;
	public static int colvalue;

	public static String readdata(String filepath, String sheetname, int rownumber, int colnumber) throws IOException

	{

		try {
			file = new FileInputStream(filepath);
			workbook = new XSSFWorkbook(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownumber);
		col = row.getCell(colnumber);

		// String value = col.toString();
		String value;

		try {
			DataFormatter d = new DataFormatter();
			value = d.formatCellValue(col);
			return value;

		} catch (Exception e) {
			value = "";
		}
		workbook.close();
		file.close();
		return value;

	}

	public static void writedata(String filepath, String sheetname, int rownumber, int colnumber, String value)
			throws IOException {
		try {
			file = new FileInputStream(filepath);
			workbook = new XSSFWorkbook(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		sheet = workbook.getSheet(sheetname);

		row = sheet.getRow(rownumber);

		col = row.getCell(colnumber);

		col.setCellValue(value);

		try {
			fileout = new FileOutputStream(filepath);
			workbook.write(fileout);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		workbook.close();

		file.close();

		fileout.close();

	}

}

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
