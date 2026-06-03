package dsa.neetcode.neetcode150.twopointer;


import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

/*
Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.

There will always be exactly one valid solution.

Your solution must use
O(1)
O(1) additional space.

Example 1:

Input: numbers = [1,2,3,4], target = 3

Output: [1,2]
Explanation:
The sum of 1 and 2 is 3. Since we are assuming a 1-indexed array, index1 = 1, index2 = 2. We return [1, 2].

Constraints:

2 <= numbers.length <= 1000
-1000 <= numbers[i] <= 1000
-1000 <= target <= 1000

 */
public class TwoIntegerSumII {
    public static void main(String[] args){
        TwoIntegerSumII twoIntegerSumII = new TwoIntegerSumII();
        System.out.println(twoIntegerSumII.twoSum(new int[]{1,2,3,4},3));

    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> set = new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            if(set.containsKey(target -numbers[i]) ){
                return new int[]{Math.min(set.get(target-numbers[i])+1,i+1),Math.max(set.get(target-numbers[i])+1,i+1)};
            }else {
                set.put(numbers[i], i);
            }
        }
        return new int[]{1,1};
    }


    //Array is sorted and we can use two pointer approach
    public int[] twoSum2(int[] numbers, int target) {
//         target=  3; [1,2,3,4]
        int i =0, j=numbers.length-1;
        while (i<j){
            if(target == numbers[i] + numbers[j]){
                return new int[]{i+1,j+1};
            }
            if(target > numbers[i] + numbers[j]){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{1,1};
    }

}
