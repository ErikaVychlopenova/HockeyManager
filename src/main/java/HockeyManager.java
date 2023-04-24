import Players.Defender;
import Players.Forward;
import Players.Goalie;
import Players.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HockeyManager {

    private List<Forward> forwards = new ArrayList<>();
    private List<Defender> defenders = new ArrayList<>();
    private List<Goalie> goalies = new ArrayList<>();

    public void AddNewForward(String name, int age, int numOfGoals){
        Forward newForward = new Forward(name, age, numOfGoals);
        forwards.add(newForward);
    }

    public void AddNewDefender(String name, int age, int hits){
        Defender newDefender = new Defender(name, age, hits);
        defenders.add(newDefender);
    }

    public void AddNewGoalie(String name, int age, int numOfVictories){
        Goalie newGoalie = new Goalie(name,age, numOfVictories);
        goalies.add(newGoalie);
    }

    public void PrintNameAndAgeOfTheYoungestPlayer(){
        List<Player> players = new ArrayList<>();
        players.addAll(forwards);
        players.addAll(defenders);
        players.addAll(goalies);

        players.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Player youngestPlayer = players.get(0);
        System.out.println("The youngest player is " + youngestPlayer.getName() + ", who is " + youngestPlayer.getAge() + " years old.");
    }
}
