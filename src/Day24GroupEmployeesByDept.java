package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is a downstream collector in Java Streams?
 *
 * Explanation:
 * A downstream collector is a collector passed as the second argument to another collector, like `groupingBy` or `partitioningBy`.
 * It performs a further reduction on the elements within each group.
 * Examples: `Collectors.counting()`, `Collectors.summingInt()`, `Collectors.toList()`.
 */

class EmployeeWithDept {
    String name;
    String department;

    public EmployeeWithDept(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Day24GroupEmployeesByDept {

    /**
     * Problem Description:
     * Given a list of Employee objects, group them by department.
     *
     * Example:
     * Input: [Employee("John", "HR"), Employee("Jane", "IT"), Employee("Doe", "IT")]
     * Output: {HR=[John], IT=[Jane, Doe]}
     */

    public static Map<String, List<EmployeeWithDept>> groupEmployeesByDept(List<EmployeeWithDept> employees) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<EmployeeWithDept> employees = Arrays.asList(
                new EmployeeWithDept("John", "HR"),
                new EmployeeWithDept("Jane", "IT"),
                new EmployeeWithDept("Doe", "IT")
        );
        Map<String, List<EmployeeWithDept>> groupedEmployees = groupEmployeesByDept(employees);

        System.out.println("Grouped Employees: " + groupedEmployees);

        // Expected Output:
        // Grouped Employees: {HR=[John], IT=[Jane, Doe]}
    }
}

/*
// Solution Implementation

public static Map<String, List<EmployeeWithDept>> groupEmployeesByDept(List<EmployeeWithDept> employees) {
    return employees.stream()
            .collect(Collectors.groupingBy(EmployeeWithDept::getDepartment));
}
*/
