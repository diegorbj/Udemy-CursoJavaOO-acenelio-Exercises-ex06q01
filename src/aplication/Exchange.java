package aplication;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is dollar price?");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double amountOfDollars = sc.nextDouble();
        System.out.printf("Amount to be paid in Brazilian Real = %.2f%n", CurrencyConverter.usDollarToBrazilianReal(price, amountOfDollars));

        sc.close();
    }
}
