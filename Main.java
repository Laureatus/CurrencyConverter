import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String FromCurrency = "CHF";
        String ToCurrency;
        double amount;
        String answer;
        double converted;

        boolean repeat = true;
        while (repeat) {
            Scanner myScanner = new Scanner(System.in); // Create a Scanner object
            System.out.println("How Much do you want to convert?");
            amount = myScanner.nextDouble();
            System.out
                    .println("To What Currency do you want to convert? \n CHF | USD | EUR | PESO | LIRA | YEN | RUBEL");
            ToCurrency = myScanner.next(); // Read user input

            switch (ToCurrency) {
                case "CHF":
                    converted = amount * 1;
                    System.out.println(amount + " " + FromCurrency + " is " + converted + " " + ToCurrency);
                    break;

                case "USD":
                    converted = amount * 1.06;
                    System.out.println(amount + " " + FromCurrency + " is " + converted + " " + ToCurrency);
                    break;

                case "EUR":
                    System.out.println(amount + " " + FromCurrency + " is " + amount * 1.02 + " " + ToCurrency);
                    break;

                case "PESO":
                    System.out.println(amount + " " + FromCurrency + " is " + amount * 20.59 + " " + ToCurrency);
                    break;

                case "LIRA":
                    System.out.println(amount + " " + FromCurrency + " is " + amount * 19.65 + " " + ToCurrency);
                    break;

                case "YEN":
                    System.out.println(amount + " " + FromCurrency + " is " + amount * 148.49 + " " + ToCurrency);
                    break;

                case "RUBEL":
                    System.out.println(amount + " " + FromCurrency + " is " + amount * 64.22 + " " + ToCurrency);
                    break;
            }
            System.out.println("Convert again? [ Y | N ]");
            answer = myScanner.next();
            if (answer == "N") {
                break;
            }
        }

    }
}