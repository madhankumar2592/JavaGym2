package com.interview.daily

/**
 * Interview Question:
 * What is a downstream collector in Java Streams?
 *
 * Explanation:
 * A downstream collector is a collector passed as the second argument to another collector, like `groupingBy` or `partitioningBy`.
 * It performs a further reduction on the elements within each group.
 * Examples: `Collectors.counting()`, `Collectors.summingInt()`, `Collectors.toList()`.
 */

data class EmployeeWithDept(val name: String, val department: String) {
    override fun toString(): String = name
}

/**
 * Problem Description:
 * Given a list of Employee objects, group them by department.
 *
 * Example:
 * Input: [Employee("John", "HR"), Employee("Jane", "IT"), Employee("Doe", "IT")]
 * Output: {HR=[John], IT=[Jane, Doe]}
 */
fun groupEmployeesByDept(employees: List<EmployeeWithDept>): Map<String, List<EmployeeWithDept>> {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val employees = listOf(
        EmployeeWithDept("John", "HR"),
        EmployeeWithDept("Jane", "IT"),
        EmployeeWithDept("Doe", "IT")
    )
    val groupedEmployees = groupEmployeesByDept(employees)

    println("Grouped Employees: $groupedEmployees")

    // Expected Output:
    // Grouped Employees: {HR=[John], IT=[Jane, Doe]}
}

/*
// Solution Implementation

fun groupEmployeesByDept(employees: List<EmployeeWithDept>): Map<String, List<EmployeeWithDept>> {
    return employees.groupBy { it.department }
}
*/
