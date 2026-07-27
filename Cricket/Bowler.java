public class Bowler extends Player {

    public Bowler(int playerID, String name, String country, int[] scores) {
        super(playerID, name, country, scores);
    }

    public int getWickets() {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        return sum;
    }

    public void addScore(int score) {
        if (score >= 0 && score <= 10) {
            System.out.println("New total wickets: " + (getWickets() + score));
        } else {
            System.out.println("The wickets should be between 0 and 10.");
        }
    }

    public void printDetails() {
        System.out.println("Bowler's ID: " + getPlayerID());
        System.out.println("Name: " + getName());
        System.out.println("Country: " + getCountry());

        System.out.print("Wickets: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("Total wickets: " + getWickets());
        System.out.println();
    }
}