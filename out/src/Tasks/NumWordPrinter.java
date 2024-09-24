package Tasks;
public class NumWordPrinter {
    public String printWord(int number) {
        String result;
        if (isDivisibleBy(number, 2) && isDivisibleBy(number, 11) && isDivisibleBy(number, 13)) {
            result = "EvenPrimeLucky";
        } else if (isDivisibleBy(number, 2) && isDivisibleBy(number, 11)) {
            result = "EvenPrimeEleven";
        } else if (isDivisibleBy(number, 2)) {
            result = "Even";
        } else if (isDivisibleBy(number, 11)) {
            result = "PrimeEleven";
        } else if (isDivisibleBy(number, 13)) {
            result = "LuckyThirteen";
        } else {
            result = "OddOneOut";
        }
        return  result;
    }
    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
