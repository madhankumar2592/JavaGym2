package com.interview.daily

/**
 * Interview Question:
 * How do you sort a list of custom objects in Java?
 *
 * Explanation:
 * 1. Implement the `Comparable` interface in your custom class for natural ordering.
 * 2. Provide a `Comparator` to `Collections.sort()` or `list.sort()` for custom or multiple sorting strategies.
 * 3. Use `Stream.sorted(Comparator)` for a functional approach.
 */

data class Employee(val name: String, val age: Int) {
    override fun toString(): String = "Employee{name='$name', age=$age}"
}

/**
 * Problem Description:
 * Given a list of Employee objects, sort them by age in ascending order.
 *
 * Example:
 * Input: [Employee("John", 30), Employee("Jane", 25), Employee("Doe", 35)]
 * Output: [Employee("Jane", 25), Employee("John", 30), Employee("Doe", 35)]
 */
fun sortEmployeesByAge(employees: List<Employee>): List<Employee> {
    TODO("Implement this method")
}

fun main() {
    val employees = listOf(
        Employee("John", 30),
        Employee("Jane", 25),
        Employee("Doe", 35)
    )
    val sortedEmployees = sortEmployeesByAge(employees)

    println("Sorted Employees: $sortedEmployees")

    // Expected Output:
    // Sorted Employees: [Employee{name='Jane', age=25}, Employee{name='John', age=30}, Employee{name='Doe', age=35}]
}

/*
// Solution Implementation

fun sortEmployeesByAge(employees: List<Employee>): List<Employee> =
    employees.sortedBy { it.age }
*/
