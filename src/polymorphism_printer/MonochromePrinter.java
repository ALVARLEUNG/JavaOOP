package polymorphism_printer;

public class MonochromePrinter extends Printer {
    @Override
    public void print () {
        System.out.println("我是黑白打印机，可以打印黑白纸！");
    }
}
