package PayrollSystem;
import java.time.LocalDate;


public class ContractorEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public ContractorEmployee(String id, String name, LocalDate joinDate,
                              int hourlyRate, int hoursWorked) {
        super(id, name, (double) hourlyRate * hoursWorked, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateNetSalary() {
        return (hourlyRate * hoursWorked) - calculateTax();
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return baseSalary * 0.05 * performanceScore;
    }

    @Override
    public String toString() {
        return "ContractorEmployee{" + super.toString() +
               ", hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "}";
    }
}
