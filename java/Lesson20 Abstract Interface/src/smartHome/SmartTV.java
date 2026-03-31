package smartHome;

public class SmartTV implements Controllable, Dimmable {
    private boolean isON;
    private int brightness;

    @Override
    public void turnOn() {
        if (!isON) {
            isON = true;
            System.out.println("TV turnON");
            return;
        } else {
            System.out.println("TV is already ON");
        }
    }

    @Override
    public void turnOff() {
        if (isON) {
            isON = false;
            brightness = 0;
            System.out.println("TV turnOFF");
            return;
        }
        System.out.println("TV is already OFF");

    }

    @Override
    public void getStatus() {
        System.out.printf("TV is %s", isON?"ON":"OFF");
        if (isON) {
            System.out.printf("Led brightness %d\n", brightness);
        } else {
            System.out.println("Led brightness 0");
        }
    }

    @Override
    public void setBrightness(int level) {
        if (!isON) {
            System.out.println("TV is OFF");
            return;
        }
        if (level <= 0) {
            level = 0;
            System.out.println("Set  led brightness to 0");
            return;
        }
        if (level >= 100) {
            level = 100;
            System.out.println("Set led brightness to 100");
            return;
        }

        System.out.printf("Set led brightness to %d\n", level);
        brightness = level;
    }

    @Override
    public void getBrightness() {
        if (!isON) {
            System.out.println("TV is OFF");
        }
        System.out.printf("Current led brightness is %d\n", brightness);
    }
}
