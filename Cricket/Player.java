public abstract class Player {

    protected int playerID;
    protected String name;
    protected String country;
    protected int[] scores;

    public Player(int playerID, String name, String country, int[] scores) {
        this.playerID = playerID;
        this.name = name;
        this.country = country;
        this.scores = scores;
    }

    public int getPlayerID() {
        return playerID;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public abstract void addScore(int score);

    public abstract void printDetails();
}