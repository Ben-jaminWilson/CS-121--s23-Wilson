package activity13;

public class activity13 {
    public int age = 10;
    public String name;
    private double grade;
    private String favColor;

    public activity13(String name,int age,double grade, String favColor){
        this.name=name;
        this.age= age;
        this.favColor = favColor;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getFavColor() {
        return favColor;
    }
    private void setFavColor(String favColor) {
        this.favColor = favColor;

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    private double getGrade(){
        return grade;
    }

    void setGrade(double grade){
        this.grade = grade;
    }


    public void displayInfo(){
        System.out.printf("name = %s\n" +
                "age = %d\n" + "favColor %s\n"+" grade= %.2f \n", name,age,favColor, grade);
    }


}

