package polymorphism_printer;

public class ColourPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("我是彩色打印机，可以打印彩色纸！");
    }
}
