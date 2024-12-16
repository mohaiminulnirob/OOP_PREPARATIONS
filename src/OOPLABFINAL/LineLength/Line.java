package OOPLABFINAL.LineLength;

class Line {
    private Point begin, end;

    // Constructor using x1, y1, x2, y2
    public Line(double x1, double y1, double x2, double y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // Constructor using Point instances
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // toString method
    @Override
    public String toString() {
        return "Line @ " + begin + " to " + end;
    }

    // Method to compute length of the line
    public double getLength() {
        return begin.distance(end);
    }
}
