package dsa.neetcode.neetcode150.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sum3 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                map.put(sum, i + "_" + j);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(-1 * (nums[i]))) {
                List<Integer> integers = validResult(i,nums[i], map.get(-1 * (nums[i])));
                if(!integers.isEmpty()){
                    result.add(integers);
                }
            }
        }
        return result;
    }

    public List<Integer> validResult(int i,int number, String key) {
        String[] s = breakKey(key);
        List<Integer> list = new ArrayList<>();
        if (s.length!=2 || Integer.parseInt(s[0]) == number || Integer.parseInt(s[1]) == number) {
            return list;
        }
        list.add(i);
        list.add(Integer.parseInt(s[0]));
        list.add(Integer.parseInt(s[1]));
        return list;
    }

    public String[] breakKey(String key) {
        String[] s = key.split("_");
        return s;
    }

    public static void main(String[] args) {
        Sum3 sum3 = new Sum3();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(sum3.threeSum(nums));
        System.out.println("-----\n\n");
        System.out.println(sum3.threeSum2(nums));

        int[] num1s = {
                3,0,-2,-1,1,2};
        System.out.println(sum3.threeSum2Pointer(num1s));
    }

    public List<List<Integer>> threeSum2(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                for (int k=j+1; k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        result.add(integers);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }


    public List<List<Integer>> threeSum2Pointer(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length;i++){
            int j=i+1, k = nums.length -1  ;
            while(j<k){
                if (nums[i] + nums[j] + nums[k] == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                j++;k--;
            }
        }

        return new ArrayList<>(result);
    }







}
