package activity1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Activity1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("What's you name?");
      String userInput = scanner.nextLine();

      String lowercaseInput = userInput.toLowerCase();
      String uppercaseInput = userInput.toUpperCase();

      StringBuilder reversedName = new StringBuilder(userInput);
      String reversedInput = reversedName.reverse().toString();

      System.out.println(lowercaseInput);
      System.out.println(uppercaseInput);
      System.out.println(reversedInput);

      scanner.close();
   }



/*public class Activity1b {
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
   }*/
}