package polymorphism_printer;

public class Main {
    public static void main(String[] args) {
        MonochromePrinter monochromePrinter = new MonochromePrinter();
        monochromePrinter.print();
        ColourPrinter colourPrinter = new ColourPrinter();
        colourPrinter.print();
    }
}
