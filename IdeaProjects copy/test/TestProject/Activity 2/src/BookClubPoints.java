import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
     Scanner console = new Scanner(System.in);
     System.out.println("How many books have you purchased this week?");
     String purchasedBooks = console.nextLine();
     console.close();
     if purchasedBooks = String.valueOf(4);
            System.out.println("you have 60 points");
     if purchasedBooks = String.valueOf(3);
            System.out.println("you have 30 points");
     if purchasedBooks = String.valueOf(2);
            System.out.println("you have 15 points");
     if purchasedBooks = String.valueOf(1);
            System.out.println("you have 5 points");
     if purchasedBooks = String.valueOf(0);
            System.out.println("you have 0 points, loser");


        System.out.println();
        Scanner.close();
    }
}
public class TestScores {
    public static void TestScores(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first test score:");
        double Test1 = scanner.nextDouble();
        System.out.print("enter second test score:");
        double Test2 = scanner.nextDouble();
        System.out.print("enter third test score:");
        double Test3 = scanner.nextDouble();

        double Average = (Test1 + Test2 + Test3)/3;


        if Average double(>=90); {
            grade = "A";
        }
        else if Average double(>=80){
            grade = "B";
        }
        else if Average double(>=70){
            grade = "C";
        }
        else if Average double(>=60){
            grade = "D";
        }
        else if Average double(<60){
            grade = "pretty fucked dude";
            }
        System.out.println("you're letter grade is" + grade);
        System.out.println("you're average test scores were" + Average);

        scanner.close();


    }
}