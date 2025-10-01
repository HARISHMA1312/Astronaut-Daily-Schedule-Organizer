package Creational.Factory;

public class JsonLogParser implements ILogParser {
    @Override
    public void parse(String filePath) {
        System.out.println("Parsing JSON log file: " + filePath);
    }
}
