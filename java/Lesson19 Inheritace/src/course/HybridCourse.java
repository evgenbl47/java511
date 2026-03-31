package course;

public class HybridCourse extends Course {
    String adress;
    String platform;

    public HybridCourse(String adress, String platform) {
        this.adress = adress;
        this.platform = platform;
    }

    @Override
    public void info() {
        System.out.println("Platform :" + platform + ", adress :" + adress);
    }


}
