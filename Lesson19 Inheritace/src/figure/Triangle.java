package figure;

public class Triangle extends Shape{
    private double a, b, c;
    private double area;
    private double perimeter;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return perimeter = a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
//Shape	        Area Formula	            Perimeter/Circumference Formula
//Triangle      Area = 0.5 × base × height	Perimeter = a + b + c