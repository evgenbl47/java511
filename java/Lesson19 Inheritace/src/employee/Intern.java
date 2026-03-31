package employee;

public class Intern extends Employee {
    private int hours;

    public Intern(String name, double salary) {
        super(name, salary);
        this.hours = 180;
    }


    @Override
    public double calculateSalary() {
        double res;
        res = (getSalary() / 30) + hours * 0.1;
        return res;
    }
}
