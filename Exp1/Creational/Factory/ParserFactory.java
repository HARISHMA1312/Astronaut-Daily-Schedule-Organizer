package Creational.Factory;

public class ParserFactory {
    public static ILogParser getParser(String fileExtension) {
        switch (fileExtension.toLowerCase()) {
            case "json":
                return new JsonLogParser();
            case "xml":
                return new XmlLogParser();
            case "csv":
                return new CsvLogParser();
            default:
                throw new IllegalArgumentException("Unsupported file format: " + fileExtension);
        }
    }
}
