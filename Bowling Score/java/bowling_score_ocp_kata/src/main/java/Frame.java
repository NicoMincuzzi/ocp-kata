import java.util.List;

public class Frame {
    private final List<Point> pointList;
    private float actualFrame = 0;

    public Frame(List<Point> points) {
        this.pointList = points;
    }

    public int calculateScore(List<Integer> rollPoints) {
        int score = 0;
        int i = 0;

        while (i < rollPoints.size()) {
            for (Point it : pointList) {
                if (it.apply(rollPoints, i, actualFrame)) {
                    score += it.calculate(rollPoints, i);
                    actualFrame += it.nextFrame();
                }
            }
            resetFrameWindow();
            updateFrameInSpare();
            i += 1;
        }
        return score;
    }

    private void updateFrameInSpare() {
        if (actualFrame == 0.5)
            actualFrame += 0.5f;
    }

    private void resetFrameWindow() {
        if (actualFrame == 1)
            actualFrame = 0;
    }
}
