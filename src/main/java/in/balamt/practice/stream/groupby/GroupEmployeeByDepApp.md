You can use Java 8 streams to achieve this by grouping the employees by department and then finding the maximum salary within each group. Here's how you can do it:

```java
import java.util.*;
import java.util.stream.Collectors;

public class MaxSalaryPerDepartment {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 5000, "HR"),
                new Employee(2, "Alice", 6000, "IT"),
                new Employee(3, "Bob", 7000, "HR"),
                new Employee(4, "Jane", 8000, "IT"),
                new Employee(5, "Mary", 7500, "Finance"),
                new Employee(6, "David", 9000, "IT")
        );

        // Group employees by department and find max salary in each department
        Map<String, Optional<Employee>> maxSalaryPerDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        // Print max salary per department
        maxSalaryPerDepartment.forEach((department, employee) -> {
            if (employee.isPresent()) {
                System.out.println("Department: " + department + ", Max Salary: " + employee.get().getSalary());
            } else {
                System.out.println("Department: " + department + ", No employees found");
            }
        });
    }
}

class Employee {
    private int empId;
    private String name;
    private int salary;
    private String department;

    public Employee(int empId, String name, int salary, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
```

Output:
```
Department: HR, Max Salary: 7000
Department: Finance, Max Salary: 7500
Department: IT, Max Salary: 9000
```

In this example, we use the `groupingBy` collector to group the employees by department. Within each group, we use the `maxBy` collector to find the employee with the maximum salary. The result is a map where each department is associated with the employee having the highest salary in that department. Finally, we print the max salary per department.