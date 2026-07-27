public class Batsman extends Player {

    public Batsman(int playerID, String name, String country, int[] scores) {
        super(playerID, name, country, scores);
    }

    public int getRuns() {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        return sum;
    }

    public void addScore(int score) {
        if (score >= 0 && score <= 100) {
            System.out.println("New total runs: " + (getRuns() + score));
        } else {
            System.out.println("The score should be between 0 and 100.");
        }
    }

    public void printDetails() {
        System.out.println("Batsman's ID: " + getPlayerID());
        System.out.println("Name: " + getName());
        System.out.println("Country: " + getCountry());

        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("Total runs: " + getRuns());
        System.out.println();
    }
}