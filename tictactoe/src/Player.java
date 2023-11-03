package src;

public class Player {

    private String name;
    private char headsOrTails;
    private int wins, losses, draws;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getHeadsOrTails() {
        return headsOrTails;
    }

    public void setHeadsOrTails(char headsOrTails) {
        this.headsOrTails = headsOrTails;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
