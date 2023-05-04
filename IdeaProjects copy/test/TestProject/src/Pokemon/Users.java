package Pokemon;

public class Users {
    Pokemon x;
    int wins = 0;

    public Users(Pokemon x){
        this.x = x;

    }
    public void addsWins(int y){
        wins = wins + y;
    }
    public int getWins(){
        return wins;
    }
}