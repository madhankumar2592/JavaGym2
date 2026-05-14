
import java.util.HashSet;
import java.util.Set;

/**
 * Interview Question:
 * What is the contract between hashCode() and equals()?
 *
 * Explanation:
 * 1. If two objects are equal according to equals(), they must have the same hashCode().
 * 2. If two objects have the same hashCode(), they are NOT necessarily equal (collision).
 * 3. Always override hashCode() when you override equals() to prevent broken behavior in HashMaps/HashSets.
 */

public class Day03FindDuplicateNumber {

    /**
     * Problem Description:
     * Given an array of integers, find the first duplicate number.
     * If no duplicate exists, return -1.
     *
     * Example:
     * Input: [1, 3, 4, 2, 2]
     * Output: 2
     */

    public static int findDuplicate(int[] nums) {
        // TODO: Implement this method
        return -1;
    }

 void main(String[] args) {
        int[] input = {1, 3, 4, 2, 2};
        int result = findDuplicate(input);

        System.out.println("Duplicate: " + result);

        // Expected Output:
        // Duplicate: 2
    }
}


public static int findDuplicate(int[] nums){
    Set<Integer> seen = new HashSet<>();
    for(Integer num : nums){
        if(seen.contains(num)){
            return num;
        }
        seen.add(num);
    }

    return -1;
}

void main() {

    int[] input = {1, 3, 4, 2, 2};
    int result = findDuplicate(input);

    System.out.println("Duplicate: " + result);

}

