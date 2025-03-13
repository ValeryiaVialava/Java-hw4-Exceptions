import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number between 0,1 and 9999,99: ");

            double number = Double.parseDouble(String.valueOf(scanner.nextDouble())); // or double number = Double.parseDouble(scanner.nextLine());
            if (number < 0.1) throw new IllegalArgumentException("Number should be positive.");
            if (number > 9999.99) throw new IllegalArgumentException("Number is out of given range.");
            double root = Math.sqrt(number);
            System.out.print("Square root of " + number + " is ~ ");
            System.out.printf("%.2f\n", root);
        } catch (NumberFormatException e){
            System.out.println("It is not a number.");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}