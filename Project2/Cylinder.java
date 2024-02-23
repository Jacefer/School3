package Project2;

public class Cylinder extends base implements ThreeDimensionalShape{

    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double v,double c) {
        super();
        this.radius = v;
        this.height = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getHeight() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return (2.0 * Math.PI * Math.pow(radius, 2)) + (2.0 * Math.PI * radius * height);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}