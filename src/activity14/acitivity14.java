package activity14;

public class acitivity14 {
    private int hitpoints;
    private int strength;
    private String name;
    private int speed;

    public acitivity14() {

    }

    public acitivity14(String name) {
        this.name = name;
    }

    public acitivity14(String name, int speed, int strength, int hitpoints) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
        this.hitpoints = hitpoints;

    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int newHitpoints, int speed) {
        hitpoints = newHitpoints;

    }
    public int getHitpoints(int hitpoints, int newSpeed) {
        if (hitpoints < 25) {
            speed = newSpeed - 2;
        }
    return hitpoints;
    }
    public int getSpeed() {
        return speed;
    }

    public void setspeed(int newSpeed) {
        speed = newSpeed;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int newStrength) {
        strength = newStrength;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName) {
        name = newName;

    }




}