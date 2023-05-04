package activity15;
import java.util.Scanner;
public class activity15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[2];
        String[] letterGrades = new String[2];
        int[] scores = new int[2];

        for (int i = 0; i <2; i++){
            System.out.println("enter first name:");
            names[i] = scanner.nextLine();
            System.out.println("enter letter grade:");
            letterGrades[i] = scanner.nextLine();
            System.out.println("enter test score:");
            scores[i] = Integer.parseInt(scanner.nextLine());
        }

        for(int i = 0; i < 2; i++){
            System.out.printf("\"%-14s %d\n", names[i] + "",scores[i], letterGrades[i]);
        }

//weird errors regarding for loops, name.length not working so used 2, I think im missing an import
        scanner.close();

    }

}
