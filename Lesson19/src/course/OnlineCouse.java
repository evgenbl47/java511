package course;

public class OnlineCouse extends Course {
    String platform;

    public OnlineCouse(String platform) {
        this.platform = platform;
    }

    @Override
    public void info() {
        System.out.println("Platform :" + platform);
    }
}
