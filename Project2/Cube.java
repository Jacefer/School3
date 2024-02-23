package Project2;

public class Cube implements baseTwo, ThreeDimensionalShape {

    private double length;

    public Cube() {
        super();
        this.length = 0.0;
    }

    public Cube(double v) {
        super();
        this.length = v;
    }

    public double getLength() {
        return length;
    }

    public void setRadius(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return 6.0 * (length * length);
    }

    public double volume() {
        return Math.pow(length, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("length=").append(length);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}