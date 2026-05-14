
import java.util.HashMap;
import java.util.Map;

/**
 * Interview Question:
 * How does a HashMap work internally in Java?
 *
 * Explanation:
 * - It uses an array of Nodes (buckets).
 * - Key's hashCode() determines the index: index = hashCode % arrayLength.
 * - If collision occurs (same index), it uses a LinkedList (or Red-Black Tree in Java 8+ if size > 8).
 * - equals() is used to find the correct key in the bucket.
 */

public class Day04TwoSum {

    /**
     * Problem Description:
     * Given an array of integers and a target, return indices of the two numbers such that they add up to target.
     * Assume exactly one solution exists.
     *
     * Example:
     * Input: nums = [2, 7, 11, 15], target = 9
     * Output: [0, 1]
     */

    public static int[] twoSum(int[] nums, int target) {
        // TODO: Implement this method
        return new int[]{};
    }
    void main(String[] args) {


        // Expected Output:
        // Indices: [0, 1]
    }
}

public static int[] findTwoSum(int[] nums, int target){

    Map<Integer, Integer> haveSeen = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (haveSeen.containsKey(complement)) {
            return new int[] { haveSeen.get(complement), i };
        }
        haveSeen.put(nums[i], i);
    }

    for (int i = 0;i<nums.length;i++){
        int complement = target-nums[i];
    }

    throw new IllegalArgumentException("No two sum solution");
}

void main() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = findTwoSum(nums, target);

    System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}

/*
// Solution Implementation

public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/
