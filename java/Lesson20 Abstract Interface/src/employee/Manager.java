package employee;

public class Manager extends Employee{

    public Manager(String name, int ID, double baseSalary) {
        super(name, ID, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double res;
        return res = ((getBaseSalary() / 100.0) * 20) + getBaseSalary();
    }
}
