package course;

public class OfflineCourse extends Course {
    String adress;

    public OfflineCourse(String adress) {
        this.adress = adress;
    }

    @Override
    public void info() {
        System.out.println("Adress :" + adress);
    }
}
