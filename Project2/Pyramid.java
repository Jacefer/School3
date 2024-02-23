package Project2;

public class Pyramid implements baseTwo, ThreeDimensionalShape{

    private double length;
    private double height;

    public Pyramid() {
        super();
        this.length = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double v,double c) {
        super();
        this.length = v;
        this.height = c;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    public double surfaceArea() {
    	double s = Math.sqrt(Math.pow((length/2), 2) + Math.pow(height, 2));
        return Math.pow(length, 2) + (2.0*length*(s));
    }

    public double volume() {
        return (1.0/3.0) * Math.pow(length, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("length=").append(length);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}