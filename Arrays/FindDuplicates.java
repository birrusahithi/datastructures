package Arrays;
/*
Find All Duplicates in an Array
        Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

        You must write an algorithm that runs in O(n) time and uses only constant extra space.
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(set.contains(i)){
                list.add(i);
            }else{
                set.add(i);
            }
        }
        return list;
    }
}
