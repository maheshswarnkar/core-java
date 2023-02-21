package ms.examples.iCare.readXLFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author MAHESH
 *
 */
public class ImageProcedureFileProcessor {

	private List<OrderablePojo> fileData;
	private File file;
	private FileInputStream fileInputStream;
	private XSSFWorkbook workbook;

	/**
	 * This method used to create new file in system.
	 * 
	 * @param filePath
	 */
	private void createNewFile(String filePath) {
		File file = new File(filePath);
		setFile(file);
	}

	/**
	 * This method used to create File input stream object.
	 */
	private void createFileInputStream() {
		try {
			FileInputStream inputFileStream = new FileInputStream(getFile());
			setFileInputStream(inputFileStream);
		} catch (FileNotFoundException e) {
			System.out.println("System is not able to read file due to " + e.getMessage());
		}
	}

	/**
	 * This method is used to create workbook of excel sheet.
	 */
	private void createXSSFWorkbook() {
		// Create Workbook instance holding reference to .xlsx file
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(getFileInputStream());
			setWorkbook(workbook);
		} catch (IOException e) {
			System.out.println("System is not able to create workbook " + e.getMessage());
		}

	}

	/**
	 * @param filePath
	 * @return
	 */
	@SuppressWarnings("unlikely-arg-type")
	public List<OrderablePojo> getVistaImagingOrdersList() {

		try {

			// Read first/desired sheet from the workbook
			XSSFSheet sheet = getWorkbook().getSheetAt(0);

			boolean firstRow = true;

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			OrderablePojo orderablePojo = null;
			List<OrderablePojo> listOfOrders = new ArrayList<OrderablePojo>();
			ImageProcedureFileHelper helper = new ImageProcedureFileHelper();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				orderablePojo = new OrderablePojo();
				// For each row, iterate through all the columns of sheet
				// For reading ID
				Cell orderTypesCell = row.getCell(0);
//				System.out.print(orderTypesCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(orderTypesCell.getStringCellValue());

				Cell typesCell = row.getCell(1);
//				System.out.print(typesCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(typesCell.getStringCellValue());

				Cell nameCell = row.getCell(2);
//				System.out.print(nameCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(nameCell.getStringCellValue());

				Cell activeCell = row.getCell(3);
				if (firstRow) {
//					System.out.print(activeCell.getStringCellValue() + "\t");
					orderablePojo.setOrderTypes(activeCell.getStringCellValue());
				} else {
//					System.out.print(String.valueOf(activeCell.getBooleanCellValue()) + "\t");
					orderablePojo.setActive(String.valueOf(activeCell.getBooleanCellValue()));
				}

				Cell inActivatedDateCell = row.getCell(4);
//				System.out.print(inActivatedDateCell.getStringCellValue() + "\t");
				orderablePojo.setInactivatedDate(inActivatedDateCell.getStringCellValue());

				Cell cpTCodeCell = row.getCell(5);
				if (firstRow) {
//					System.out.print(cpTCodeCell.getStringCellValue() + "\t");
					orderablePojo.setCptCode(cpTCodeCell.getStringCellValue());
				} else {
//					System.out.print(String.valueOf(cpTCodeCell.getNumericCellValue()) + "\t");
					orderablePojo.setCptCode(String.valueOf(cpTCodeCell.getNumericCellValue()));
				}

				Cell referenceIDCell = row.getCell(6);
//				System.out.print(referenceIDCell.getStringCellValue() + "\t");
				orderablePojo.setReferenceId(referenceIDCell.getStringCellValue());

				if (orderablePojo.getOrderTypes().equals(ImageProcedureFileConstants.IMG_ORDER_TYPE)) {
					Cell availableModifierCell = row.getCell(7);
//					System.out.print(availableModifierCell.getStringCellValue() + "\t");
					String availableModifier = helper.getVistaImageAvailableModifier(orderablePojo);
					orderablePojo.setAvailableModifier(availableModifier);
				} else {
					Cell availableModifierCell = row.getCell(7);
//					System.out.print(availableModifierCell.getStringCellValue() + "\t");
					String availableModifier = helper.getVistaProAvailableModifier(orderablePojo);
					orderablePojo.setAvailableModifier(availableModifier);
				}

				if (!orderablePojo.getOrderTypes().equals(ImageProcedureFileConstants.PROCEDURE_ORDER_TYPE)) {
					Cell relatedServiceCell = row.getCell(8);
//					System.out.print(relatedServiceCell.getStringCellValue() + "\t");
					orderablePojo.setRelatedServices(relatedServiceCell.getStringCellValue());
				}

				firstRow = false;

				listOfOrders.add(orderablePojo);
			}
			System.out.println(listOfOrders);

			return listOfOrders;
		} catch (Exception e) {
			System.out.println("Issue in reading data " + e);
		}
		return null;

	}

	/**
	 * @return
	 */
	public List<OrderablePojo> getIMOImagingOrdersList() {

		try {

			// Read first/desired sheet from the workbook
			XSSFSheet sheet = getWorkbook().getSheetAt(1);

			boolean firstRow = true;

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			OrderablePojo orderablePojo = null;
			List<OrderablePojo> listOfOrders = new ArrayList<OrderablePojo>();
			ImageProcedureFileHelper helper = new ImageProcedureFileHelper();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				orderablePojo = new OrderablePojo();
				// For each row, iterate through all the columns of sheet
				// For reading ID
				Cell orderTypesCell = row.getCell(0);
//				System.out.print(orderTypesCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(orderTypesCell.getStringCellValue());

				Cell typesCell = row.getCell(1);
//				System.out.print(typesCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(typesCell.getStringCellValue());

				Cell nameCell = row.getCell(2);
//				System.out.print(nameCell.getStringCellValue() + "\t");
				orderablePojo.setOrderTypes(nameCell.getStringCellValue());

				Cell activeCell = row.getCell(3);
				if (firstRow) {
//					System.out.print(activeCell.getStringCellValue() + "\t");
					orderablePojo.setOrderTypes(activeCell.getStringCellValue());
				} else {
//					System.out.print(String.valueOf(activeCell.getBooleanCellValue()) + "\t");
					orderablePojo.setActive(String.valueOf(activeCell.getBooleanCellValue()));
				}

				Cell inActivatedDateCell = row.getCell(4);
//				System.out.print(inActivatedDateCell.getStringCellValue() + "\t");
				orderablePojo.setInactivatedDate(inActivatedDateCell.getStringCellValue());

				Cell cpTCodeCell = row.getCell(5);
				if (firstRow) {
//					System.out.print(cpTCodeCell.getStringCellValue() + "\t");
					orderablePojo.setCptCode(cpTCodeCell.getStringCellValue());
				} else {
//					System.out.print(String.valueOf(cpTCodeCell.getNumericCellValue()) + "\t");
					orderablePojo.setCptCode(String.valueOf(cpTCodeCell.getNumericCellValue()));
				}

				Cell iCD10PCCodeCell = row.getCell(6);
//				System.out.print(iCD10PCCodeCell.getStringCellValue() + "\t");
				orderablePojo.setIcd10PcCode(iCD10PCCodeCell.getStringCellValue());

				Cell iMOLexicalCodeCell = row.getCell(7);
//				System.out.print(iMOLexicalCodeCell.getStringCellValue() + "\t");
				orderablePojo.setImoLexicalCode(iMOLexicalCodeCell.getStringCellValue());

				if (orderablePojo.getOrderTypes().equals(ImageProcedureFileConstants.PROCEDURE_ORDER_TYPE)) {
					Cell availableModifierCell = row.getCell(8);
//					System.out.print(availableModifierCell.getStringCellValue() + "\t");
					String availableModifier = helper.getImoProcedureAvailableModifier(orderablePojo);
					orderablePojo.setAvailableModifier(availableModifier);
				}else {
					Cell availableModifierCell = row.getCell(8);
//					System.out.print(availableModifierCell.getStringCellValue() + "\t");
					String availableModifier = helper.getImoImageAvailableModifier(orderablePojo);
					orderablePojo.setAvailableModifier(availableModifier);
				}

				if (orderablePojo.getOrderTypes().equals(ImageProcedureFileConstants.PROCEDURE_ORDER_TYPE)) {
					Cell relatedServiceCell = row.getCell(9);
//					System.out.print(relatedServiceCell.getStringCellValue() + "\t");
					orderablePojo.setRelatedServices(relatedServiceCell.getStringCellValue());

				}
				firstRow = false;

				listOfOrders.add(orderablePojo);
			}
			System.out.println(listOfOrders);

			return listOfOrders;
		} catch (Exception e) {
			System.out.println("Issue in reading data " + e);
		}
		return null;

	}

	public static void main(String[] args) {

		String filePath = "D:\\swarnkar\\iCare-Project-Docs\\Imaging-Procedure-Orderable\\Imaging-Procedure-Orderable.xlsx";
		ImageProcedureFileProcessor imageProcedureFileProcessor = new ImageProcedureFileProcessor();
		imageProcedureFileProcessor.createNewFile(filePath);
		imageProcedureFileProcessor.createFileInputStream();
		imageProcedureFileProcessor.createXSSFWorkbook();
		List<OrderablePojo> ordersList = imageProcedureFileProcessor.getVistaImagingOrdersList();
		if (ordersList.size() > 0) {
			System.out.println("Data was successfully read from file \n " + ordersList);
			imageProcedureFileProcessor.setFileData(ordersList);
		} else {
			System.out.println("Issue in reading orders list ..");
		}
	}

	public List<OrderablePojo> getFileData() {
		return fileData;
	}

	public void setFileData(List<OrderablePojo> fileData) {
		this.fileData = fileData;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}

}
