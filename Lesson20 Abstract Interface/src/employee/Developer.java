package employee;

public class Developer extends Employee{

    private int completedProjects;
    public Developer(String name, int ID, double baseSalary) {
        super(name, ID, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double res;
        return res = getBaseSalary() + (1000 * completedProjects);
    }
}
