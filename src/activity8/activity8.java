package activity8;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.Scanner;

public class activity8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("How many students are there?");
         int studentnumber = scanner.nextInt();
         System.out.println("How many tests have each student taken?");
         int testnumber = scanner.nextInt();
        double totalledPoints =0;

       for  (int n = 0; n <= studentnumber; n++) {



           for (int t=0; t <= testnumber; t++) {
               System.out.printf("Enter test score %d:\n", t+1);
               double points = Double.parseDouble(scanner.nextLine());

               totalledPoints +=points;




            }
           double average = totalledPoints/testnumber;
           System.out.println("the average score for student %d: ");
        }
    }
}
