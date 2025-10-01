package Creational.Factory;

public class CsvLogParser implements ILogParser {
    @Override
    public void parse(String filePath) {
        System.out.println("Parsing CSV log file: " + filePath);
    }
}
