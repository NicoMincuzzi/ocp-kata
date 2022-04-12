import java.util.ArrayList;
import java.util.List;

class Accumulator implements Rolls {
    private final List<Integer> points = new ArrayList<>();
    private final Frame frame;

    public Accumulator(Frame frame) {
        this.frame = frame;
    }

    public void add(int n) {
        points.add(n);
    }

    public int sum() {
        return frame.calculateScore(points);
    }
}