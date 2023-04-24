public class App {
    public static void main(String[] args) {
        HockeyManager hockeyManager = new HockeyManager();

        hockeyManager.AddNewForward("Forward Thomas", 20, 10);
        hockeyManager.AddNewDefender("Defender Dany", 19, 2);
        hockeyManager.AddNewGoalie("Defender Derek", 18, 5);

        hockeyManager.PrintNameAndAgeOfTheYoungestPlayer();
    }
}
