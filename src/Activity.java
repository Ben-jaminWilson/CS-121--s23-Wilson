import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("choose your first number");
        double userInput = scanner.nextDouble();

        System.out.print("choose your second number");
        double userInput2 = scanner.nextDouble();

        double sum = userInput + userInput2;
        double product = userInput * userInput2;
        double division = userInput / userInput2;
        double square1 = Math.sqrt(userInput);
        double square2 = Math.sqrt(userInput2);

        System.out.print(sum);
        System.out.print(product);
        System.out.print(division);
        System.out.print(square1);
        System.out.print(square2);

        scanner.close();
    }
}





