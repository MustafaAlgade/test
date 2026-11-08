

package PayrollSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PayrollSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E001", "Ahmed", 5000, LocalDate.of(2020, 3, 15), 800));
        employees.add(new FullTimeEmployee("E002", "Sara", 7000, LocalDate.of(2018, 7, 1), 1200));
        employees.add(new ContractorEmployee("C001", "Omar", LocalDate.of(2023, 1, 10), 50, 120));

        Collections.sort(employees);

        double performanceScore = 4.0;

        for (Employee e : employees) {
            System.out.println(e);
            System.out.printf("  Tax:        %.2f%n", e.calculateTax());
            System.out.printf("  Net Salary: %.2f%n", e.calculateNetSalary());
            System.out.printf("  Bonus:      %.2f%n", e.calculateBonus(performanceScore));
            System.out.println();
        }
    }
}
