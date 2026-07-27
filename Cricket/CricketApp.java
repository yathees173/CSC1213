public class CricketApp {

    public static void main(String[] args) {

        Batsman b1 = new Batsman(
            1,
            "Sachin Tendulkar",
            "India",
            new int[]{42, 0, 61, 15, 0, 100, 23, 64, 41, 0, 26}
        );

        Batsman b2 = new Batsman(
            2,
            "Virat Kohli",
            "India",
            new int[]{0, 25, 10, 60, 11, 0, 40, 11, 0, 2, 0}
        );

        Batsman b3 = new Batsman(
            3,
            "MS Dhoni",
            "India",
            new int[]{6, 22, 48, 0, 11, 69, 0, 21, 19, 0, 42}
        );

        Batsman b4 = new Batsman(
            4,
            "Ricky Ponting",
            "Australia",
            new int[]{11, 0, 28, 0, 64, 18, 45, 26, 0, 11, 0}
        );

        Batsman b5 = new Batsman(
            5,
            "Brian Lara",
            "West Indies",
            new int[]{0, 13, 21, 47, 0, 69, 17, 0, 12, 0, 40}
        );

        Bowler bowler1 = new Bowler(
            6,
            "Muttiah Muralitharan",
            "Sri Lanka",
            new int[]{3, 5, 2, 4, 1}
        );

        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
        b4.printDetails();
        b5.printDetails();

        bowler1.printDetails();

        b1.addScore(50);
        bowler1.addScore(4);
    }
}