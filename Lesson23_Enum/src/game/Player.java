package game;

public class Player {
    private String name;
    private Point currentPos;
    private Direction direction;

    private int x;
    private int y;

    public Player(String name) {
        this.name = name;
        currentPos = new Point();
    }

    public void move() {
        direction.step(currentPos);

//        if (this.direction == Direction.LEFT) {
//            currentPos.setX(currentPos.getX() - 1);
//        } else if (this.direction == Direction.RIGHT) {
//            currentPos.setX(currentPos.getX() + 1);
//        } else if (this.direction == Direction.UP) {
//            currentPos.setY(currentPos.getY() + 1);
//        } else if (this.direction == Direction.DOWN) {
//            currentPos.setY(currentPos.getY() - 1);
//        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Player [" +
                "name=" + name +
                ", currentPos=" + currentPos +
                ']';
    }

    public String print() {
        return "Player [" +
                "name=" + name +
                ", posX=" + x +
                ", posY=" + y +
                ']';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


//public class ClassWork {
//
//    public void aVoid() {
//        game.Direction select = game.Direction.valueOf("UP");
//
//        if (select == game.Direction.RIGHT) {
//            System.out.println("x++");
//        } else if (select == game.Direction.LEFT) {
//            System.out.println("x--");
//        } else if (select == game.Direction.UP) {
//            System.out.println("y++");
//        } else if (select == game.Direction.DOWN) {
//            System.out.println("y--");
//        }
//    }
//
//}
