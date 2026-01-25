package employee;

public class Developer extends Employee {
    private int prodjects;

    public Developer(String name, double salary) {
        super(name, salary);
        this.prodjects = 4;
    }

    @Override
    public double calculateSalary() {
        double res;
        res = getSalary() * (prodjects * 2);
        return res;
    }
}
