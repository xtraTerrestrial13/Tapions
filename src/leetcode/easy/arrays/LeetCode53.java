package leetcode.easy.arrays;

/**

 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 A subarray is a contiguous part of an array.



 Example 1:

 Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 Example 2:

 Input: nums = [1]
 Output: 1
 Example 3:

 Input: nums = [5,4,-1,7,8]
 Output: 23


 Constraints:

 1 <= nums.length <= 105
 -104 <= nums[i] <= 104


 Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 */
public class LeetCode53 {


    public static void main(String[] args) {
        //A High Can be reached in between



    }

    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=0;


        for (int i = 1; i < nums.length; i++) {

            if (currentSum<0) {
                currentSum=0;
            }
            currentSum+=nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}

class Solution {
    public int maxSubArray(int[] nums)
    {
        int maxsub = nums[0];
        int cursub = 0;


        for (int i: nums)
        {
            if(cursub < 0)
            {
                cursub = 0;
            }
            cursub+=i;
            maxsub = max(maxsub, cursub);



        }
        return maxsub;
    }

    public int max(int a, int b)
    {
        int maximum;
        if(a> b)
        {
            maximum = a;
        }
        else
        {
            maximum = b;
        }
        return maximum;
    }
}
