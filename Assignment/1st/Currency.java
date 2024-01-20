import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        // Q : Input currency in rupees and output in USD.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the currency in rupees : ");
        double CurrencyInRupees = input.nextDouble();
        double ExchangeRate = 0.0414;

        double CurrencyInUsd = CurrencyConvert (CurrencyInRupees , ExchangeRate );
        System.out.print("Amount in USD " + CurrencyInUsd);
    }
    static double CurrencyConvert (double CurrencyInRupees ,double ExchangeRate){
        return CurrencyInRupees * ExchangeRate;
    }

}
