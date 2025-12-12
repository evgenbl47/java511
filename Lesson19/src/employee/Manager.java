package employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        this.bonus = 7.8;
    }

    @Override
    public double calculateSalary() {
        double res;
        res = getSalary() * bonus;
        return res;
    }
}
