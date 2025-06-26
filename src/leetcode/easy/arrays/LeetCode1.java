package leetcode.easy.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {


        Map<Integer,Integer> numberPositionMap=new HashMap<>();
        for(int i=0; i<nums.length;i++){

            int numberInQuestion = nums[i];




            if(i<nums.length-1 && numberInQuestion +nums[i+1]==target){
                return pushSolution(i,i+1);
            }else{
                boolean flag=false;
                int remainder = target- numberInQuestion;
                if(numberPositionMap.containsKey(remainder)){
                    flag=true;}
                if(flag){
                    return pushSolution(i,numberPositionMap.get(remainder));
                }
            }
            numberPositionMap.put(numberInQuestion,i);
        }

        return new int[2];
    }


    private int[] pushSolution(int n1,int n2){
        int[] solution=new int[2];

        solution[0]=n1;
        solution[1]=n2;

        return solution;
    }
}
