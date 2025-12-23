package game;

public enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private int xStep, yStep;

    Direction(int x, int y) {
        this.xStep = x;
        this.yStep = y;
    }

    public void step(Point point) {
        point.setY(point.getY() + yStep);
        point.setX(point.getX() + xStep);
    }
}
