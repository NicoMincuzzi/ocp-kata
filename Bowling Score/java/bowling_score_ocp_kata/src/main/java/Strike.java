import java.util.List;

public class Strike implements Point {

    @Override
    public boolean apply(List<Integer> points, int actualIndex, float actualFrame) {
        return points.get(actualIndex) == 10;
    }

    @Override
    public int calculate(List<Integer> points, int actualIndex) {
        int result = 0;
        if (actualIndex + 2 < points.size() - 1)
            result += points.get(actualIndex + 1) + points.get(actualIndex + 2);
        return result;
    }

    @Override
    public float nextFrame() {
        return 1.0f;
    }
}
