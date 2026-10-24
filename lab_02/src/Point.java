public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        double sum = Math.pow(otherPoint.x - this.x, 2) + Math.pow(otherPoint.y - this.y, 2);
        return Math.sqrt(sum);
    }
}
