package activity14;

public  class Main {
    public static void main(String[] args){
        acitivity14 a1 = new acitivity14();
        acitivity14 a2 = new acitivity14("Ben");
        acitivity14 a3 = new acitivity14("jeremy",5,12,8);

        System.out.printf("orignal health %d\n" , a3.getHitpoints());
        a3.setHitpoints(10, a3.getSpeed());
        System.out.printf("set health: %d\n", a3.getHitpoints());
        a3.setHitpoints(10,a3.getSpeed());
        System.out.printf("set health with strength: %d\n", a3.getSpeed());

    }
}
