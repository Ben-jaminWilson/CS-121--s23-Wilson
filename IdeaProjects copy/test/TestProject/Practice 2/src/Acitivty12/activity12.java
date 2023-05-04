package Acitivty12;

public class activity12 {
    private double length;
    private double width;
    private double area;

    public activity12(){
    length = 0;
    width  = 0;
    area   = 0;
    }

    public activity12(double length, double width){
        this.length = length;
        this.width  = width;
    }
    public activity12(double length, double width,double area) {
        this.length = length;
        this.width = width;
        this.area = area;
    }
    public double getLength(){
        return length;
        }
    public double getWidth() {
        return width;
        }
    public double getArea() {
        return area;
        }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void displayInfo(){
        System.out.printf("rectangle length = %.1f\n" +
        "rectangle length = %.1f\n" + "rectangle Area = %.1f\n", length, width,area);
    }
    public String displayData() {
        return String.format("rectangle length = %.1f\n" +
                "rectangle length = %.1f\n" +
                "rectangle Area = %.1f\n", length, width, area);
    }
    }

