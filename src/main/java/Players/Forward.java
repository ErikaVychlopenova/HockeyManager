package Players;

public class Forward extends Player{

    private int numOfGoals;

    public Forward(String name, int age, int numOfGoals) {
        super(name, age);
        this.numOfGoals = numOfGoals;
    }

    public int getNumOfGoals() {
        return numOfGoals;
    }
}
