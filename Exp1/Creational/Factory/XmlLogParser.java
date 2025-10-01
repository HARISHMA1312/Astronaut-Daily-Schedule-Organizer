package Creational.Factory;

public class XmlLogParser implements ILogParser {
    @Override
    public void parse(String filePath) {
        System.out.println("Parsing XML log file: " + filePath);
    }
}
