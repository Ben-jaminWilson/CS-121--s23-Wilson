package activity11;
import java.util.Scanner;

public class acitivty11
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double Length = getLength();
        double Width = getWidth();
        double Area = getArea(Width,Length);
        System.out.println(displayData( Length,Width,Area));

        scanner.close();


    }



    public static String displayData(double Length, double Width, double Area){
        return String.format("rectangle length = %.1f\n" +
                             "rectangle length = %.1f\n" +
                             "rectangle Area = %.1f\n", Length, Width,Area);}



    public static double getLength(){
            System.out.println("what is the length of the rectangle");
            double Length = scanner.nextDouble();
            return Length;
        }

    public static double getWidth(){
            System.out.println("what is the width of the rectangle");
            double Width = scanner.nextDouble();
            return Width;
        }

    public static double getArea(double Width, double Length){
            double Area = (Width * Length);
            return Area;
        }

    }
