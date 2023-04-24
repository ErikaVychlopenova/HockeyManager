package Players;

public class Goalie extends Player{

    private int numOfVictories;

    public Goalie(String name, int age, int numOfVictories) {
        super(name, age);
        this.numOfVictories = numOfVictories;
    }

    public int getNumOfVictories() {
        return numOfVictories;
    }
}
