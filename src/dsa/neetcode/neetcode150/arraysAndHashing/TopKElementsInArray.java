package dsa.neetcode.neetcode150.arraysAndHashing;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class TopKElementsInArray {


    public static void main(String[] args){


        TopKElementsInArray topKElementsInArray = new TopKElementsInArray();
        topKElementsInArray.topKFrequent(new int[]{7,4},2);
    }



    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int num : nums){
            if(countMap.containsKey(num)){
                countMap.replace(num,countMap.get(num)+1);
                continue;
            }
            countMap.put(num,1);
        }

        int[] resultArray = new int[k];
        List<Integer>[] buckets = new List[nums.length];
        for(int i=0; i<buckets.length; i++  ){
            buckets[i]= new ArrayList<>();
        }


        Set<Map.Entry<Integer, Integer>> entries = countMap.entrySet();

        for(Map.Entry<Integer,Integer> entry: entries){
            Integer key = entry.getKey();
            Integer frequency = entry.getValue();
            buckets[frequency-1].add(key);
        }


        for(int i = buckets.length-1, j=0; i>=0 && j<resultArray.length; i--){
            if(!buckets[i].isEmpty()){
                for (Integer integer : buckets[i]) {
                    resultArray[j] = integer;
                    j++;
                }
            }
        }

        return resultArray;
    }
}
