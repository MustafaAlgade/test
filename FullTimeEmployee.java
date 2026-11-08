package PayrollSystem;
import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
    private final double allowance;

    public FullTimeEmployee(String id, String name, double baseSalary,
                            LocalDate joinDate, double allowance) {
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() {
        return baseSalary + allowance - calculateTax();
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return baseSalary * 0.10 * performanceScore;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + super.toString() + ", allowance=" + allowance + "}";
    }
}
