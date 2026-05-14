package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What are some common aggregate functions available in `Collectors`?
 *
 * Explanation:
 * `Collectors` provides several methods for summarizing data:
 * - `Collectors.summingInt()`: Calculates the sum of an integer-valued function.
 * - `Collectors.averagingDouble()`: Calculates the average of a double-valued function.
 * - `Collectors.summarizingInt()`: Returns an `IntSummaryStatistics` object with count, sum, min, average, and max.
 * - `Collectors.counting()`: Counts the number of elements.
 */

class EmployeeWithSalary {
    String name;
    String department;
    double salary;

    public EmployeeWithSalary(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class Day25AverageSalary {

    /**
     * Problem Description:
     * Given a list of Employee objects, calculate the average salary per department.
     *
     * Example:
     * Input: [Employee("John", "HR", 50000), Employee("Jane", "IT", 60000), Employee("Doe", "IT", 70000)]
     * Output: {HR=50000.0, IT=65000.0}
     */

    public static java.util.Map<String, Double> averageSalaryByDept(List<EmployeeWithSalary> employees) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<EmployeeWithSalary> employees = Arrays.asList(
                new EmployeeWithSalary("John", "HR", 50000),
                new EmployeeWithSalary("Jane", "IT", 60000),
                new EmployeeWithSalary("Doe", "IT", 70000)
        );
        java.util.Map<String, Double> avgSalaries = averageSalaryByDept(employees);

        System.out.println("Average Salaries by Dept: " + avgSalaries);

        // Expected Output:
        // Average Salaries by Dept: {HR=50000.0, IT=65000.0}
    }
}

/*
// Solution Implementation

public static java.util.Map<String, Double> averageSalaryByDept(List<EmployeeWithSalary> employees) {
    return employees.stream()
            .collect(Collectors.groupingBy(
                    EmployeeWithSalary::getDepartment,
                    Collectors.averagingDouble(EmployeeWithSalary::getSalary)
            ));
}
*/
