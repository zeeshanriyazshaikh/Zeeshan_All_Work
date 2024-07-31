public class ReadFile {
    public static void main(String[] args) {
        try {
            Workbook workbook = Workbook.getWorkbook(new File("file.xls"));
            Sheet sheet = workbook.getSheet(0);

            for (int row = 0; row < sheet.getRows(); row++) {
                for (int col = 0; col < sheet.getColumns(); col++) {
                    Cell cell = sheet.getCell(col, row);
                    String cellContent = cell.getContents(); // Get the cell content as a String
                    processCellContent(cellContent); // Pass it to a method that takes a String
                    System.out.print(cellContent + "\t");
                }
                System.out.println();
            }
            workbook.close();
        } catch (BiffException | IOException e) {
            e.printStackTrace();
        }
    }

    // Method that takes a String parameter
    public static void processCellContent(String content) {
        // Do something with the cell content
        System.out.println("Processing cell content: " + content);
    }
}
