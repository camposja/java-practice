import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        double tip;
        double total;

        System.out.print("Enter the subtotal: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        tip = (gratuityRate / 100) * subtotal;
        total = subtotal + tip;

        System.out.println("The gratuity is $" + tip + " and total is $" + total);
    }
}