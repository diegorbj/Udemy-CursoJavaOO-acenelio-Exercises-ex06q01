package util;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double usDollarToBrazilianReal(double price, double amount){
        return (price * amount) * (1 - IOF / 100);
    }
}
