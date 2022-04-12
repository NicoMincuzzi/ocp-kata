import java.util.List;

public class Spare implements Point {

    @Override
    public boolean apply(List<Integer> points, int actualIndex, float actualFrame) {
        return actualIndex + 1 < points.size() &&
                points.get(actualIndex) + points.get(actualIndex + 1) == 10 &&
                actualFrame == 0;
    }

    @Override
    public int calculate(List<Integer> points, int actualIndex) {
        int result = 0;
        if (actualIndex + 2 < points.size() - 1)
            result += points.get(actualIndex + 2);
        return result;
    }

    @Override
    public float nextFrame() {
        return 0.5f;
    }
}
