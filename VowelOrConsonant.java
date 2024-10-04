import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        // Step 1: Check for vowel or consonant
        System.out.print("Enter a letter: ");
        String letterInput = input.nextLine().trim();

        if (letterInput.length() != 1 || !Character.isLetter(letterInput.charAt(0))) {
            System.out.println("Invalid input. Enter only a single letter.");
            input.close();
            return;
        }

        letterInput = letterInput.toLowerCase();
        
        if ("aeiou".indexOf(letterInput) >= 0) {
            System.out.println(letterInput + " is a vowel.");
        } else if ("bcdfghjklmnpqrstvwxyz".indexOf(letterInput) >= 0) {
            System.out.println(letterInput + " is a consonant.");
        } else {
            System.out.println("Invalid input.");
            input.close();
            return;
        }

        // Step 2: Check for valid letter grade
        System.out.print("Enter a letter grade: ");
        String letterGrade = input.nextLine().trim().toUpperCase();

        if (letterGrade.length() != 1 || !"ABCDF".contains(letterGrade)) {
            System.out.println(letterGrade + " is not a valid letter grade.");
        } else {
            System.out.println(letterGrade + " is a valid letter grade.");
        }

        input.close();
    }
}

