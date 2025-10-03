import java.util.Scanner;
public class ShipCostCalculator {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        System.out.print("Enter the price of your item:");

        if (console.hasNextDouble()) {

            double price = console.nextDouble();

            if (price < 0) {
                System.out.println("Invalid Input");
            } else if (price >= 100) {
                System.out.println("Shipping cost: 0.00 " + " Leaving you at a total of 1" + price);
            } else if (price < 100) {
                System.out.println("Shipping cost: " + " " + (price * 0.05) + " " + "Leaving you at a total of " + (price + (price * 0.05)));


                }
            }

            else if (!console.hasNextDouble()) {
                System.out.println("Invalid Input");
        }
    }
}
