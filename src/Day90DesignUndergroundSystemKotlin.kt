package com.interview.daily

/**
 * Interview Question:
 * How would you design a system to calculate the average travel time between two stations?
 *
 * Explanation:
 * - You need to store check-in and check-out information for each customer.
 * - You also need to store the total travel time and count for each pair of stations.
 * - HashMaps are a good choice for storing this information.
 */

/**
 * Problem Description:
 * An underground railway system is keeping track of customer travel times between different stations. They are using this data to calculate the average time it takes to travel from one station to another.
 * Implement the UndergroundSystem class:
 * - void checkIn(int id, string stationName, int t)
 *   - A customer with a card ID equal to id, checks in at the station stationName at time t.
 *   - A customer can only be checked into one place at a time.
 * - void checkOut(int id, string stationName, int t)
 *   - A customer with a card ID equal to id, checks out from the station stationName at time t.
 * - double getAverageTime(string startStation, string endStation)
 *   - Returns the average time it takes to travel from startStation to endStation.
 *   - The average time is computed from all the previous traveling times from startStation to endStation that happened directly, meaning a check in at startStation followed by a check out from endStation.
 *
 * Example:
 * UndergroundSystem undergroundSystem = new UndergroundSystem();
 * undergroundSystem.checkIn(45, "Leyton", 3);
 * undergroundSystem.checkIn(32, "Paradise", 8);
 * undergroundSystem.checkIn(27, "Leyton", 10);
 * undergroundSystem.checkOut(45, "Waterloo", 15);
 * undergroundSystem.checkOut(27, "Waterloo", 20);
 * undergroundSystem.checkOut(32, "Cambridge", 22);
 * undergroundSystem.getAverageTime("Paradise", "Cambridge"); // return 14.00000
 * undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000
 * undergroundSystem.checkIn(10, "Leyton", 24);
 * undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000
 * undergroundSystem.checkOut(10, "Waterloo", 38);
 * undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 12.00000
 */
class UndergroundSystem {
    private data class CheckIn(val station: String, val time: Int)

    private data class Average(var totalTime: Double = 0.0, var count: Int = 0)

    private val checkIns = mutableMapOf<Int, CheckIn>()
    private val averages = mutableMapOf<String, Average>()

    fun checkIn(id: Int, stationName: String, t: Int) {
        // TODO: Implement this method
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        // TODO: Implement this method
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        // TODO: Implement this method
        return 0.0
    }
}

fun main() {
    val undergroundSystem = UndergroundSystem()
    undergroundSystem.checkIn(45, "Leyton", 3)
    undergroundSystem.checkIn(32, "Paradise", 8)
    undergroundSystem.checkIn(27, "Leyton", 10)
    undergroundSystem.checkOut(45, "Waterloo", 15)
    undergroundSystem.checkOut(27, "Waterloo", 20)
    undergroundSystem.checkOut(32, "Cambridge", 22)
    println(undergroundSystem.getAverageTime("Paradise", "Cambridge"))
    println(undergroundSystem.getAverageTime("Leyton", "Waterloo"))
    undergroundSystem.checkIn(10, "Leyton", 24)
    println(undergroundSystem.getAverageTime("Leyton", "Waterloo"))
    undergroundSystem.checkOut(10, "Waterloo", 38)
    println(undergroundSystem.getAverageTime("Leyton", "Waterloo"))

    // Expected Output:
    // 14.0
    // 11.0
    // 11.0
    // 12.0
}

/*
// Solution Implementation

fun checkIn(id: Int, stationName: String, t: Int) {
    checkIns[id] = CheckIn(stationName, t)
}

fun checkOut(id: Int, stationName: String, t: Int) {
    val checkIn = checkIns[id]!!
    val route = "${checkIn.station}->$stationName"
    val travelTime = t - checkIn.time

    val average = averages.getOrPut(route) { Average() }
    average.totalTime += travelTime
    average.count++

    checkIns.remove(id)
}

fun getAverageTime(startStation: String, endStation: String): Double {
    val route = "$startStation->$endStation"
    val average = averages[route]!!
    return average.totalTime / average.count
}
*/
