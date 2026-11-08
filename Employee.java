package PayrollSystem;
import java.time.LocalDate;


public abstract class Employee implements Comparable<Employee>, Taxable, BonusCalculable {
    private final String id;
    private final String name;
    protected double baseSalary;
    private final LocalDate joinDate;

    public Employee(String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;
    }

    public abstract double calculateNetSalary();

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.baseSalary, other.baseSalary);
    }

    @Override
    public double calculateTax() {
        return baseSalary * TAX_RATE;
    }

    @Override
    public abstract double calculateBonus(double performanceScore);

    public String getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public LocalDate getJoinDate() { return joinDate; }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name +
               "', baseSalary=" + baseSalary + ", joinDate=" + joinDate + "}";
    }
}


