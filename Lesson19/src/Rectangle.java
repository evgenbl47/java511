public class Rectangle {
    private int width;
    private int height;

    public void setSize(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Size lower than zero");
            return;
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcArea() {
            if (width < 0 || height < 0) {
                System.out.println("Area arguments lower than zero");
                return 0;
            }
            int result;
            result = width * height;
            return  result;
        }

    public int calcPerimeter() {
        if (width < 0 || height < 0) {
            return 0;
        }
        int result;
        result = 2 * (width + height);
        return result;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


