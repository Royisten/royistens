package LeetcodesTest;

import java.util.Scanner;
//twosum solution with user interaction 
public class tsum { public static void main(String[] args) {
        Scanner tsumeg = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int size = tsumeg.nextInt();

        // Input array elements
        int nums[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = tsumeg.nextInt();
        }

        // Input target sum
        System.out.println("Enter the target sum:");
        int target = tsumeg.nextInt();

        // Call the twoSum function
        int result[] = twoSum(nums, target);

        // Output result
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that sum up to the target:");
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
        tsumeg.close();
    }
    // this is part of the code (Function)that is actually submitted in leetcodes
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    
}
//In the provided code, the twoSum function returns an array containing the indices of two numbers that sum up to the target. 
//The result array is initialized with a length of 2 because we know we're looking for two indices.
//So, when you call twoSum(nums, target), it returns an array with two elements:
//the indices of the two numbers in the nums array that add up to the target.


//in case ,if the twoSum function were modified to return three indices
// like twoSum(nums1, nums2, target), then the result array would be declared with a length of 3.
//So, when printing the result, you would access result[0], result[1], and result[2] 
//to get the indices of the three numbers.