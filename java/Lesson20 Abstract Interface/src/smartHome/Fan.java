package smartHome;

public class Fan implements Controllable {
    private boolean isON = false;
    @Override
    public void turnOn() {
        if (!isON) {
            isON = true;
            System.out.println("Fan turnON");
            return;
        } else {
            System.out.println("Fan is already ON");
        }
    }

    @Override
    public void turnOff() {
        if (isON) {
            isON = false;
            System.out.println("Fan turnOFF");
            return;
        }
        System.out.println("Fan is already OFF");

    }

    @Override
    public void getStatus() {
        System.out.printf("Fan is %s\n", isON?"ON":"OFF");
    }
}
