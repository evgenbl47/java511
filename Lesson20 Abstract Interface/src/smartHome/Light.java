package smartHome;

public class Light implements Controllable, Dimmable {
    private boolean isON = false;
    private int brightness = 0;
    @Override
    public void turnOn() {
        if (!isON) {
            isON = true;
            System.out.println("Light turnON");
            return;
        } else {
            System.out.println("Light is already ON");
        }
    }

    @Override
    public void turnOff() {

        if (isON) {
            isON = false;
            brightness = 0;
            System.out.println("Light turnOFF");
            return;
        }
        System.out.println("Light is already OFF");

    }

    @Override
    public void getStatus() {
        System.out.printf("Light %s. ", isON?"turnON":"turnOFF");
        if (isON) {
            System.out.printf("Brightness %d\n", brightness);
        } else {
            System.out.println("Brightness 0");
        }
    }

    @Override
    public void setBrightness(int level) {
        if (!isON) {
            System.out.println("Lamp is OFF");
            return;
        }
        if (level <= 0) {
            level = 0;
            System.out.println("Set brightness to 0");
            return;
        }
        if (level >= 100) {
            level = 100;
            System.out.println("Set brightness to 100");
            return;
        }

        System.out.printf("Set brightness to %d\n", level);
        brightness = level;
    }

    @Override
    public void getBrightness() {
        if (!isON) {
            System.out.println("Current lamp is OFF");
        }
        System.out.printf("Current brightness is %d\n", brightness);
    }
}
