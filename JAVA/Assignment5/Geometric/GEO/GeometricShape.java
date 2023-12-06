package GEO;

public abstract class GeometricShape {
    protected double area;
    protected double perimeter;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}