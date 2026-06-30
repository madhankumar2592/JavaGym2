package com.interview.daily

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

data class EmployeeWithSalary(
    val name: String,
    val department: String,
    val salary: Double
)

/**
 * Problem Description:
 * Given a list of Employee objects, calculate the average salary per department.
 *
 * Example:
 * Input: [Employee("John", "HR", 50000), Employee("Jane", "IT", 60000), Employee("Doe", "IT", 70000)]
 * Output: {HR=50000.0, IT=65000.0}
 */
fun averageSalaryByDept(employees: List<EmployeeWithSalary>): Map<String, Double> {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val employees = listOf(
        EmployeeWithSalary("John", "HR", 50000.0),
        EmployeeWithSalary("Jane", "IT", 60000.0),
        EmployeeWithSalary("Doe", "IT", 70000.0)
    )
    val avgSalaries = averageSalaryByDept(employees)

    println("Average Salaries by Dept: $avgSalaries")

    // Expected Output:
    // Average Salaries by Dept: {HR=50000.0, IT=65000.0}
}

/*
// Solution Implementation

fun averageSalaryByDept(employees: List<EmployeeWithSalary>): Map<String, Double> {
    return employees
        .groupBy { it.department }
        .mapValues { (_, deptEmployees) -> deptEmployees.map { it.salary }.average() }
}
*/
