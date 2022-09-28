import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wilt u de prijs inclusief of exclusief berekenen?");

        String userInput = scanner.nextLine();

        Calculations calculations = new Calculations();

        switch (userInput) {
            case "inclusief":
            case "incl":
            case "inc":
                System.out.println("ok");
                calculations.getPrices();
                calculations.returnWithVAT();
                break;
            case "exclusief":
            case "excl":
            case "ex":
                System.out.println("ok exc");
                calculations.getPrices();
                calculations.returnWithoutVAT();
                break;
            default:
                System.out.println("Typ inclusief/incl/inc of exclusief/excl/ex");
        }
    }
}
