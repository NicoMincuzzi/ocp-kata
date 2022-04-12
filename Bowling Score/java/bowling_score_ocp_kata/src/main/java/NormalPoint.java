import java.util.List;

public class NormalPoint implements Point {

    @Override
    public boolean apply(List<Integer> points, int actualIndex, float actualFrame) {
        return true;
    }

    @Override
    public int calculate(List<Integer> points, int actualIndex) {
        return points.get(actualIndex);
    }

    @Override
    public float nextFrame() {
        return 0;
    }
}