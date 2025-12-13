package figure;

public class Sqare extends Shape{
    private double side;
    private double area;
    private double perimeter;

    @Override
    public double calculateArea() {
        return area = Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return perimeter = 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
//Shape	        Area Formula	            Perimeter/Circumference Formula
//Square	    Area = a²	                Perimeter = 4 × a