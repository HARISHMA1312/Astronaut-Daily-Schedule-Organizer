package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        String file1 = "data.json";
        String file2 = "report.xml";
        String file3 = "records.csv";

        ILogParser parser1 = ParserFactory.getParser("json");
        parser1.parse(file1);

        ILogParser parser2 = ParserFactory.getParser("xml");
        parser2.parse(file2);

        ILogParser parser3 = ParserFactory.getParser("csv");
        parser3.parse(file3);
    }
}
