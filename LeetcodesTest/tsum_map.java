package LeetcodesTest;

import java.util.HashMap;
import java.util.Scanner;
// refer the para comment at the end for better understanding.
public class tsum_map {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        // Ask the user to input the length of the array
        System.out.println("Enter the length of the array:");
        int length = sca.nextInt();
        int nums[] = new int[length];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = sca.nextInt();
        }

        // Ask the user to input the target sum
        System.out.println("Enter the target sum:");
        int target = sca.nextInt();

        // Call the twoSum method to find the indices of numbers that add up to the target
        int result[] = twoSum(nums, target);

        // Display the result
        if (result != null) {
            System.out.println("Indices of the numbers that add up to the target sum:");
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

        sca.close();
    }

    // Method to find two numbers in an array that add up to a target sum
    public static int[] twoSum  (int nums[], int target) {
        // Create a map to store complements (numbers needed to reach the target)
        HashMap<Integer, Integer> complements = new HashMap<>();

        // Iterate through each element of the nums array
        for (int i = 0; i < nums.length; i++) {
            // Retrieve the index of the complement of the current number
            Integer complementIndex = complements.get(nums[i]);

            // If complementIndex is not null, it means a complement exists
            if (complementIndex != null) {
                // Return the indices of the current number and its complement
                return new int[]{i, complementIndex};
            }

            // Calculate the complement of the current number
            int complement = target - nums[i];

            // Store the complement along with its index in the map
            // This allows us to quickly find the complement later in the loop
            complements.put(complement, i);
        }

        // If no solution is found, return null
        return null;
    }
    
}
/* let's go through the process step by step with the given example array nums = [3, 9, 2, 8, 5, 1, 4, 6, 7] and the target sum target = 13.

Iteration 1 (i = 0):

1. Current number: nums[0] = 3
Complement to reach the target: complement = target - nums[0] = 13 - 3 = 10
complements HashMap: {10: 0} (index 0 corresponds to the complement 10)
Now, complementIndex = complements.get(nums[0]) looks for the complement of the current number (3) in the complements map. Since there's no entry for 3, complementIndex will be null.

2. Iteration 2 (i = 1):

Current number: nums[1] = 9
Complement to reach the target: complement = 13 - 9 = 4
complements HashMap: {10: 0, 4: 1} (index 1 corresponds to the complement 4)
Now, complementIndex = complements.get(nums[1]) looks for the complement of the current number (9) in the complements map. Since there's no entry for 9, complementIndex will be null.

3. Iteration 3 (i = 2):

Current number: nums[2] = 2
Complement to reach the target: complement = 13 - 2 = 11
complements HashMap: {10: 0, 4: 1, 11: 2} (index 2 corresponds to the complement 11)
Now, complementIndex = complements.get(nums[2]) looks for the complement of the current number (2) in the complements map. Since there's no entry for 2, complementIndex will be null.

4. Iteration 4 (i = 3):

Current number: nums[3] = 8
Complement to reach the target: complement = 13 - 8 = 5
complements HashMap: {10: 0, 4: 1, 11: 2, 5: 3} (index 3 corresponds to the complement 5)
Now, complementIndex = complements.get(nums[3]) looks for the complement of the current number (8) in the complements map. Since there's no entry for 8, complementIndex will be null.

5. Iteration 5 (i = 4):

Current number: nums[4] = 5
Complement to reach the target: complement = 13 - 5 = 8
complements HashMap: {10: 0, 4: 1, 11: 2, 5: 3, 8: 4} (index 4 corresponds to the complement 8)
Now, complementIndex = complements.get(nums[4]) looks for the complement of the current number (5) in the complements map. It finds an entry for 5, so complementIndex will be 3. This indicates that the complement of 5 (which is 8) was found at index 3.
so the output will be (4,3)--------> since it is prompt to display "return new int[]{i, complementIndex};"

This process continues until the target sum is reached or until all elements in the array are processed. In each iteration, complementIndex either holds the index of the complement found in the complements map or null if no complement is found for the current number.







 */