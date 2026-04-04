// Problem: Two Sum
// Approach: Using HashSet to store visited elements
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.HashSet;
class Solution {
    // Function to check if any two numbers in array sum to target
    boolean twoSum(int arr[], int target) {
        
        // HashSet to store elements we have seen so far
        HashSet<Integer> set = new HashSet<>();
        
        // Loop through each element in the array
        for(int num : arr) {
            
            // Find the number needed to reach the target
            int complement = target - num;
            
            // Check if complement already exists in set
            // If yes, we found two numbers whose sum is target
            if(set.contains(complement)) {
                return true;
            }
            
            // Store current number for future reference
            set.add(num);
        }
        
        // If no pair is found, return false
        return false;
    }
}