package com.interview.daily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * How do you sort a list of custom objects in Java?
 *
 * Explanation:
 * 1. Implement the `Comparable` interface in your custom class for natural ordering.
 * 2. Provide a `Comparator` to `Collections.sort()` or `list.sort()` for custom or multiple sorting strategies.
 * 3. Use `Stream.sorted(Comparator)` for a functional approach.
 */

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    // Getters...
    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Day22SortObjects {

    /**
     * Problem Description:
     * Given a list of Employee objects, sort them by age in ascending order.
     *
     * Example:
     * Input: [Employee("John", 30), Employee("Jane", 25), Employee("Doe", 35)]
     * Output: [Employee("Jane", 25), Employee("John", 30), Employee("Doe", 35)]
     */

    public static List<Employee> sortEmployeesByAge(List<Employee> employees) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 30),
                new Employee("Jane", 25),
                new Employee("Doe", 35)
        );
        List<Employee> sortedEmployees = sortEmployeesByAge(employees);

        System.out.println("Sorted Employees: " + sortedEmployees);

        // Expected Output:
        // Sorted Employees: [Employee{name='Jane', age=25}, Employee{name='John', age=30}, Employee{name='Doe', age=35}]
    }
}

/*
// Solution Implementation

public static List<Employee> sortEmployeesByAge(List<Employee> employees) {
    return employees.stream()
            .sorted(Comparator.comparingInt(Employee::getAge))
            .collect(Collectors.toList());
}
*/
