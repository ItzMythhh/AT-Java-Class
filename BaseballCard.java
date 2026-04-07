public class BaseballCard {

    private String playerName;
    private String team;
    private int year;

    public BaseballCard(String playerName, String team, int year) {
        this.playerName = playerName;
        this.team = team;
        this.year = year;
    }

    public String toString() {
        return playerName + " | " + team + " | " + year;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof BaseballCard)) {
            return false;
        }

        BaseballCard otherCard = (BaseballCard) other;

        return this.playerName.equals(otherCard.playerName) &&
               this.team.equals(otherCard.team) &&
               this.year == otherCard.year;
    }
}
