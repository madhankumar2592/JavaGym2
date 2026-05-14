package com.interview.daily;

import java.util.HashMap;
import java.util.Map;

/**
 * Interview Question:
 * How would you design a system to calculate the average travel time between two stations?
 *
 * Explanation:
 * - You need to store check-in and check-out information for each customer.
 * - You also need to store the total travel time and count for each pair of stations.
 * - HashMaps are a good choice for storing this information.
 */

public class Day90DesignUndergroundSystem {

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

    static class UndergroundSystem {
        private Map<Integer, CheckIn> checkIns;
        private Map<String, Average> averages;

        class CheckIn {
            String station;
            int time;

            CheckIn(String station, int time) {
                this.station = station;
                this.time = time;
            }
        }

        class Average {
            double totalTime;
            int count;

            Average() {
                totalTime = 0.0;
                count = 0;
            }
        }

        public UndergroundSystem() {
            checkIns = new HashMap<>();
            averages = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            // TODO: Implement this method
        }

        public void checkOut(int id, String stationName, int t) {
            // TODO: Implement this method
        }

        public double getAverageTime(String startStation, String endStation) {
            // TODO: Implement this method
            return 0.0;
        }
    }

    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkIn(10, "Leyton", 24);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkOut(10, "Waterloo", 38);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));

        // Expected Output:
        // 14.0
        // 11.0
        // 11.0
        // 12.0
    }
}

/*
// Solution Implementation

public void checkIn(int id, String stationName, int t) {
    checkIns.put(id, new CheckIn(stationName, t));
}

public void checkOut(int id, String stationName, int t) {
    CheckIn checkIn = checkIns.get(id);
    String route = checkIn.station + "->" + stationName;
    int travelTime = t - checkIn.time;

    Average average = averages.getOrDefault(route, new Average());
    average.totalTime += travelTime;
    average.count++;
    averages.put(route, average);

    checkIns.remove(id);
}

public double getAverageTime(String startStation, String endStation) {
    String route = startStation + "->" + endStation;
    Average average = averages.get(route);
    return average.totalTime / average.count;
}
*/
