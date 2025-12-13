package figure;

public class Triangle extends Shape{
    private double base;
    private double height;
    private double area;
    private double perimeter;


    @Override
    public double calculateArea() {
        return area = 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return perimeter = a + b + c;
    }
}
//Shape	        Area Formula	            Perimeter/Circumference Formula
//Triangle      Area = 0.5 × base × height	Perimeter = a + b + c