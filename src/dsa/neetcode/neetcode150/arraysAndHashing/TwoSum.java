package dsa.neetcode.neetcode150.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){

       int[] nums={3,4,5,6};
       int target = 7;

       TwoSum neetCode1 = new TwoSum();
       neetCode1.twoSum(nums,target);

    }


    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> remainderPositionMap = new HashMap<>();
        //Constraints only 1 pair per input
        for(int i = 0;i< nums.length;i ++){
            if(remainderPositionMap.containsKey(target-nums[i])){
              return  new int[]{remainderPositionMap.get(target-nums[i]),i};
            }
            remainderPositionMap.put(nums[i],i);
        }

        return new int[]{};
    }
}
