import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java.time.LocalDate;

class Employee {
    private long id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public Employee(final long id, final String name,
        final LocalDate dateOfBirth, final Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dateOfBirth="
            + dateOfBirth + ", salary=" + salary + "]";
    }
}



public class PredicateExample {
    public static void main(String[] args)
    {
    //    List<Employee> employeeList = getEmployeesFromDataSource();
    //     Enumeration<AccountStatus> statuses = Collections
    //     .enumeration(Arrays.asList(
    //       AccountStatus.ACTIVE,
    //       AccountStatus.INACTIVE));
    //     filter 1
    //     Predicate<Employee> isEmployeeActive = e -> e.getStatus() == EmployeeStatus.ACTIVE;

    // //     //filter2
    //     Predicate<Employee> isAccountActive = e -> e.getAccount().getStatus() == AccountStatus.ACTIVE;

    //     //Active employees
    //     String result = employeeList.stream()
    //             .filter(isEmployeeActive)
    //             .map(e -> e.getId().toString())
    //             .collect(Collectors.joining(",", "[", "]"));

    //     System.out.println("Active employees = " + result);

    //     //Active employees with active accounts
    //     result = employeeList.stream()
    //             .filter(isEmployeeActive.and(isAccountActive))
    //             .map(e -> e.getId().toString())
    //             .collect(Collectors.joining(",", "[", "]"));

    //     System.out.println("Active employees with active accounts = " + result);

    //     //Active employees with inactive accounts
    //     result = employeeList.stream()
    //             .filter(isEmployeeActive.and(isAccountActive.negate()))
    //             .map(e -> e.getId().toString())
    //             .collect(Collectors.joining(",", "[", "]"));

    //     System.out.println("Active employees with inactive accounts = " + result);

    //     //Inactive employees with inactive accounts
    //     result = employeeList.stream()
    //             .filter(isEmployeeActive.negate().and(isAccountActive.negate()))
    //             .map(e -> e.getId().toString())
    //             .collect(Collectors.joining(",", "[", "]"));

    //     System.out.println("Inactive employees with inactive accounts = " + result);
    // }

    // private static List<Employee> getEmployeesFromDataSource() {
    //     List<Employee> employeeList = new ArrayList<>();

    //     employeeList.add(new Employee(1L, "A", "AA", EmployeeStatus.ACTIVE,
    //         new Account(1001L, "Saving - 1001", "Saving", AccountStatus.ACTIVE)));
    //     employeeList.add(new Employee(2L, "B", "BB", EmployeeStatus.ACTIVE,
    //         new Account(1002L, "Checking - 1002", "Checking", AccountStatus.ACTIVE)));
    //     employeeList.add(new Employee(3L, "C", "CC", EmployeeStatus.ACTIVE,
    //         new Account(1003L, "Deposit - 1003", "Deposit", AccountStatus.ACTIVE)));
    //     employeeList.add(new Employee(4L, "D", "DD", EmployeeStatus.ACTIVE,
    //         new Account(1004L, "Saving - 1004", "Saving", AccountStatus.INACTIVE)));
    //     employeeList.add(new Employee(5L, "E", "EE", EmployeeStatus.ACTIVE,
    //         new Account(1005L, "Checking - 1005", "Checking", AccountStatus.INACTIVE)));
    //     employeeList.add(new Employee(6L, "F", "FF", EmployeeStatus.ACTIVE,
    //         new Account(1006L, "Deposit - 1006", "Deposit", AccountStatus.BLOCKED)));

    //     return employeeList;
    }
}
