import java.util.Arrays;

public class ExamResults {
    int[] points;

    public ExamResults(int[] points){
//        this.points = points;
        this.points = Arrays.copyOf(points, points.length);
    }

    public int[] getPoints() {
//        return this.points;
        return Arrays.copyOf(this.points, this.points.length);
    }
}
