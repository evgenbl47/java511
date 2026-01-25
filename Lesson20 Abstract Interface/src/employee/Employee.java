package employee;

public abstract class Employee {
    protected String name;
    protected int ID;
    protected double baseSalary;

    public Employee(String name, int ID, double baseSalary) {
        this.name = name;
        this.ID = ID;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void getInfo() {
        System.out.printf("Name :%s, ID :%d, baseSalary :%.2f\n", name, ID, baseSalary);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
