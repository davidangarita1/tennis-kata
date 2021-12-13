
public class TennisGame3 implements TennisGame {

    private int socrePlayer2;
    private int scorePlayer1;
    private final String player1Name;
    private final String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String s;
        if (scoreIsLowerThan4()) {
            return lowerThan4();
        } else if (scorePlayer1 == socrePlayer2) {
            return "Deuce";
        } else {
            return greaterThan4();
        }
    }

    private boolean scoreIsLowerThan4() {
        return scorePlayer1 < 4 && socrePlayer2 < 4 && scorePlayer1 + socrePlayer2 != 6;
    }

    private String greaterThan4() {
        String s;
        s = scorePlayer1 > socrePlayer2 ? player1Name : player2Name;
        return ((scorePlayer1 - socrePlayer2) * (scorePlayer1 - socrePlayer2) == 1) ? "Advantage " + s : "Win for " + s;
    }

    private String lowerThan4() {
        String s;
        String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        s = p[scorePlayer1];
        return (scorePlayer1 == socrePlayer2) ? s + "-All" : s + "-" + p[socrePlayer2];
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            this.scorePlayer1++;
        else
            this.socrePlayer2++;

    }

}
