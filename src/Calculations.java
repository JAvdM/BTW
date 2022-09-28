import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculations {

    private ArrayList<Double> prices = new ArrayList<>();
    private ArrayList<Double> results = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    private double result;

    public void getPrices() {
        System.out.println("Voer de bedragen in, of een leeg veld om af te sluiten");

        try {
            while (true) {
                double userInput = Double.parseDouble(scanner.nextLine());
                prices.add(userInput);
            }
        } catch (NumberFormatException e) {
            System.out.println("Prices:");
        }

        System.out.println(prices.toString());
    } // wanneer ik > scanner.nextLine().isEmpty()) < gebruik, worden slechts de even waarden in de ArrayList opgeslagen. Dus bij 4 bedragen als input worden alleen 0 en 2 geprint.

    public void returnWithVAT() {
        for (double price : prices) {
            result = (price / 100) * 121;
            results.add(result);
        }
        System.out.println(results.toString());
    }

    public void returnWithoutVAT() {
        for (double price : prices) {
            result = price / 1.21;
            results.add(result);
        }
        System.out.println(results.toString());
    }
}