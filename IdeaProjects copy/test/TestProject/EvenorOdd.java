import java.util.scanner;


public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new scanner(system.in);
        System.out.println("Please choose a number");
        double number = scanner.nextline();

        if (number % 2 ==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
import javax.swing.JOptionPane;
import java.util.scanner;

public class login {
    public static void main(Strings[] args) {
        String userName = "BenRox";
        String password = "RedSox";

        String UserInput = JOptionPane.showInputDialog("Enter a Username");
        String UserPass =  JOptionPane.showInputDialog("Enter a password");

        boolean UserNameValidation = UserInput.equals(userName);
        boolean PasswordValidation =  UserPass.equals(passwore);

        if (UserNameValidation &&  PasswordValidation) {
            JOptionPane.showMessageDialog(null, "Welcome to the CS 121 masterclass"); }
        else if (UserNameValidation) {
            JOptionPane.showMessageDialog(null,"Wrong password, Hint: rhymes with leadpox"); }
        else if (PasswordValidation){
            JOptionPane.showMessageDialog(null, "Wrong username, Hint: he's very humble") }
        else {
            JOptionPane.showMessageDialog(null, "Wrong username and password");}

    }
}
import javax.swing.JOptionPane;
public class Triangles {
    public static void triangleIndicator(String[] args)
        double Side1 = JOptionPane.showInputDialog("enter your first side of the triangle");

        double Side2 = JOptionPane.showInputDialog("enter your second side");

        double Side3 = JOptionPane.showInputDialog("enter your third side");

        if (Side1 == Side2 && Side2 == Side3) {
            system.out.println("equilatteral triangle"); }
        else if (Side1 == Side2 && Side1 != Side3) || (Side1 == Side3 && Side1 != Side2) || (Side2 == Side3 && Side2 != Side1);{
            system.out.println("isocelles triangle"); }
        else {
            system.out.println("Scalene triangle"); }

        }

}