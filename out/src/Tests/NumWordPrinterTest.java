package Tests;
import Tasks.NumWordPrinter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NumWordPrinterTest {
    @Test
    public void testEvenPrimeLucky() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EVENPRIMELUCKY", printer.printWord(286));
    }
    @Test
    public void testEvenPrimeEleven() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("EvenPrimeEleven", printer.printWord(22));
    }
    @Test
    public void testEven() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("Even", printer.printWord(4));
    }
    @Test
    public void testPrimeEleven() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("PrimeEleven", printer.printWord(11));
    }
    @Test
    public void testLuckyThirteen() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("LuckyThirteen", printer.printWord(13));
    }
    @Test
    public void testOddOneOut() {
        NumWordPrinter printer = new NumWordPrinter();
        assertEquals("OddOneOut", printer.printWord(7));
    }
}
