import java.util.List;

import static java.util.Arrays.asList;

public class BowlingGameFactory {
    public BowlingGame create() {
        List<Point> points = asList(new Strike(), new Spare(), new NormalPoint());
        return new BowlingGame(new Accumulator(new Frame(points)));
    }
}
