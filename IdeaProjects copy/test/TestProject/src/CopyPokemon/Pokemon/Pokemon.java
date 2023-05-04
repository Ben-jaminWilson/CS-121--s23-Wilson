package CopyPokemon.Pokemon;

public class Pokemon {

    int hitPoints;
    int hitPower;
    String name;
    int speed;
    String moveName;
    int wins;
    public Pokemon(String name, int hitPoints, int hitPower, int speed, String moveName) {
        this.hitPoints = hitPoints;
        this.hitPower = hitPower;
        this.speed = speed;
        this.name = name;
        this.moveName = moveName;
    }
    public int getPokeWins(){
        return wins;
    }

    public void addWins(){
        wins = wins + 1;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setHitPower(int hitPower){
        this.hitPower = hitPower;
    }
    public int getHitPower(){
        return hitPower;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setName(String name){
        this.name  = name;
    }
    public String getName(){
        return name;
    }
    public void setMoveName(String moveName){
        this.moveName = moveName;
    }
    public String getMoveName(){
        return moveName;
    }
}

