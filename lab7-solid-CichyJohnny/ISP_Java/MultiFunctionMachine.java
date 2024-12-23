package ISP_Java;

public class MultiFunctionMachine implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void scan() {
        System.out.println("Scanning");
    }
}
