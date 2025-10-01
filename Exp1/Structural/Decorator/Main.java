package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Text myText = new SimpleText("Hello World");

        System.out.println(myText.getContent()); // plain

        myText = new BoldDecorator(myText);
        System.out.println(myText.getContent()); // bold

        myText = new ItalicDecorator(myText);
        System.out.println(myText.getContent()); // bold + italic
    }
}
