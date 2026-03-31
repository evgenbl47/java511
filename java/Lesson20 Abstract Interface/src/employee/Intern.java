package employee;

public class Intern extends Employee{

    public Intern(String name, int ID, double baseSalary) {
        super(name, ID, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}
