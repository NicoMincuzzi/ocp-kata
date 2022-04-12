import java.util.List;

public interface Point {
    boolean apply(List<Integer> points, int actualIndex, float actualFrame);

    int calculate(List<Integer> points, int actualIndex);

    float nextFrame();
}
