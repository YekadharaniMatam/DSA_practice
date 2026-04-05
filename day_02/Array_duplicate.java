// Problem: Find Duplicates in an Array
// Approach: Using HashSet to track visited elements
// If an element is already present in the set, it is a duplicate
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    
    // Function to return all duplicate elements in the array
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        // HashSet to store elements we have seen
        HashSet<Integer> set = new HashSet<>();
        
        // ArrayList to store duplicate elements
        ArrayList<Integer> result = new ArrayList<>();
        
        // Traverse through the array
        for(int num : arr) {
            
            // If element already exists → duplicate found
            if(set.contains(num)) {
                result.add(num);
            } 
            // Otherwise store the element
            else {
                set.add(num);
            }
        }
        
        // Return list of duplicates
        return result;
    }
}