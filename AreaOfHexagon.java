import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        double area;
   
        System.out.print("Enter length of the Hexagon sides: ");
        Scanner input = new Scanner(System.in);
        double hexaSides = input.nextDouble();

        area = (6 * Math.pow(hexaSides, 2)) / (4 * Math.tan(Math.PI/6));

        System.out.println("The area of the Hexagon is: " + area);
    }
}
