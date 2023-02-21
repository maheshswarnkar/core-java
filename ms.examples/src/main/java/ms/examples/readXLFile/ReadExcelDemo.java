package ms.examples.readXLFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo {

	private List<OrderablePojo> getOrdersList() {
		try {
//			FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
			FileInputStream file = new FileInputStream(new File(
					"D:\\swarnkar\\iCare-Project-Docs\\Imaging-Procedure-Orderable\\Imaging-Procedure-Orderable.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			boolean firstRow = true;

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			OrderablePojo orderablePojo = null;
			List<OrderablePojo> listOfOrders = new ArrayList<OrderablePojo>();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				orderablePojo = new OrderablePojo();
				// For each row, iterate through all the columns
				// For reading ID
				Cell orderTypesCell = row.getCell(0);
				System.out.print(orderTypesCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(orderTypesCell.getStringCellValue());

				Cell typesCell = row.getCell(1);
				System.out.print(typesCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(orderTypesCell.getStringCellValue());

				Cell nameCell = row.getCell(2);
				System.out.print(nameCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(orderTypesCell.getStringCellValue());

				Cell activeCell = row.getCell(3);
				if (firstRow) {
					System.out.print(activeCell.getStringCellValue() + "\t");
					orderablePojo.setOrderTypes(activeCell.getStringCellValue());
				} else {
					System.out.print(String.valueOf(activeCell.getBooleanCellValue()) + "\t");
					orderablePojo.setActive(String.valueOf(activeCell.getBooleanCellValue()));
				}

				Cell inActivatedDateCell = row.getCell(4);
				System.out.print(inActivatedDateCell.getStringCellValue() + "\t");
				orderablePojo.setInactivatedDate(inActivatedDateCell.getStringCellValue());

				Cell cpTCodeCell = row.getCell(5);
				if (firstRow) {
					System.out.print(cpTCodeCell.getStringCellValue() + "\t");
					orderablePojo.setCptCode(cpTCodeCell.getStringCellValue());
				} else {
					System.out.print(String.valueOf(cpTCodeCell.getNumericCellValue()) + "\t");
					orderablePojo.setCptCode(String.valueOf(cpTCodeCell.getNumericCellValue()));
				}

				Cell iCD10PCCodeCell = row.getCell(6);
				System.out.print(iCD10PCCodeCell.getStringCellValue() + "\t");
				orderablePojo.setIcd10PcCode(iCD10PCCodeCell.getStringCellValue());

				Cell iMOLexicalCodeCell = row.getCell(7);
				System.out.print(iMOLexicalCodeCell.getStringCellValue() + "\t");
				orderablePojo.setImoLexicalCode(iMOLexicalCodeCell.getStringCellValue());

				Cell referenceIDCell = row.getCell(8);
				System.out.print(referenceIDCell.getStringCellValue() + "\t");
				orderablePojo.setReferenceId(referenceIDCell.getStringCellValue());

				Cell availableModifierCell = row.getCell(9);
				System.out.print(availableModifierCell.getStringCellValue() + "\t");
				orderablePojo.setAvailableModifier(availableModifierCell.getStringCellValue());

				Cell relatedServiceCell = row.getCell(10);
				System.out.print(relatedServiceCell.getStringCellValue() + "\t");
				orderablePojo.setRelatedServices(relatedServiceCell.getStringCellValue());

				firstRow = false;

//				Iterator<Cell> cellIterator = row.cellIterator();
//
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					// Check the cell type and format accordingly
//
//					if (cell.getCellType().equals(CellType.STRING)) {
//						System.out.print(cell.getStringCellValue() + "\t");
//					} else if (cell.getCellType().equals(CellType.NUMERIC)) {
//						System.out.print(cell.getNumericCellValue() + "\t");
//					} else if (cell.getCellType().equals(CellType.BOOLEAN)) {
//						System.out.print(cell.getBooleanCellValue() + "\t");
//					} else if (cell.getCellType().equals(CellType.FORMULA)) {
//						System.out.println(cell.getCellFormula() + "\t");
//					}
//
//				}
				listOfOrders.add(orderablePojo);
//				System.out.println("");
			}
			System.out.println(listOfOrders);
			workbook.close();
			file.close();

			return listOfOrders;
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {

	}
}
