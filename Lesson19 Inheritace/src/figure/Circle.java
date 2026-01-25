package figure;

public class Circle extends Shape {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return area = Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return perimeter = 2 * Math.PI * radius;//Math.pow(5, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
 }
//Shape	        Area Formula	            Perimeter/Circumference Formula
//Circle	    Area = π × r²	            Circumference = 2 × π × r