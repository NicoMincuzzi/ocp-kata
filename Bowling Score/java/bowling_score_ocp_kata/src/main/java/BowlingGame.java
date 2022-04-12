public class BowlingGame {
    private final Rolls rolls;

    public BowlingGame(Rolls rolls) {
        this.rolls = rolls;
    }

    public void roll(int n) {
        rolls.add(n);
    }

    public int score() {
        return rolls.sum();
    }
}
