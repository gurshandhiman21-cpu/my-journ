interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
interface Faxable {
    void fax();
}
class AllInOnePrinter implements Printable, Scannable, Faxable {
    public void print() { System.out.println("Printing document..."); }
    public void scan() { System.out.println("Scanning document..."); }
    public void fax() { System.out.println("Faxing document..."); }
}
class BasicPrinter implements Printable {
    public void print() { System.out.println("Basic printing only..."); }
}
public class MultipleInterface {
    public static void main(String[] args) {
        AllInOnePrinter aio = new AllInOnePrinter();
        aio.print(); aio.scan(); aio.fax();

        System.out.println();
        BasicPrinter bp = new BasicPrinter();
        bp.print();
    }
}
