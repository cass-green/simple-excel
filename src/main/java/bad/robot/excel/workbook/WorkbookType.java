package bad.robot.excel.workbook;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public enum WorkbookType {
    XLS("Excel Binary File Format (pre 2007)") {
        @Override
        public Workbook create() {
            return new HSSFWorkbook();
        }
    },
    XML("Office Open XML") {
        @Override
        public Workbook create() {
            return new XSSFWorkbook();
        }
    };

    private final String description;

    WorkbookType(String description) {
        this.description = description;
    }

    public abstract Workbook create();

    public String getDescription() {
        return description;
    }
}