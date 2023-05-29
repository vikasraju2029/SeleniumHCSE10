package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains reusable methods to operate on Excel
 * 
 * @author vikas
 */
public class ExcelUtility {
    private Workbook workbook;

    /**
     * This method is used to initialize the Excel file
     * 
     * @param excelPath
     */
    public void excelInit(String excelPath) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(excelPath);
            workbook = WorkbookFactory.create(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to read a single data from the Excel
     * 
     * @param sheetName
     * @param rowNum
     * @param cellNum
     * @return
     */
    public String getDataFromExcel(String sheetName, int rowNum, int cellNum) {
        DataFormatter df = new DataFormatter();
        String data = df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
        return data;
    }

    public Map<String, String> getDataFromExcel(String sheetName) {
        DataFormatter df = new DataFormatter();
        Map<String, String> map = new HashMap<String, String>();
        Sheet sheet = workbook.getSheet(sheetName);

        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            String key = df.formatCellValue(sheet.getRow(i).getCell(0));
            String value = df.formatCellValue(sheet.getRow(i).getCell(1));
            map.put(key, value);
        }
        return map;
    }

    public void writeToExcel(String sheetName, int rowNum, int cellNum, String excelPath, String data) {
        Cell cell = workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum);
        cell.setCellValue(data);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(excelPath);
            workbook.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeExcel() {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
