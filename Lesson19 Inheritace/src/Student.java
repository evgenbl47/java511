public class Student {
    private String name;
    private int age;
    private int average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 16 || age >= 100) {
            return;
        }
        this.age = age;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        if (average <= 0 || average >= 100) {
            return;
        }
        this.average = average;
    }
}
