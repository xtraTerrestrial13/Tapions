package dsa.neetcode.neetcode150.arraysAndHashing;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args){
         ValidAnagram validAnagram = new ValidAnagram();

         GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.hashKey("car"));
        System.out.println(groupAnagrams.hashKey("aggaccaddbab"));

        String[] array = new String[]{"act","pots","tops","cat","stop","hat"};
        groupAnagrams.groupAnagrams(array);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> mapOfStrings = new HashMap<>();

        //Iterate over the strings and create a string for it, on the A-Z array.
        for(String str : strs){
            String hashKey = hashKey(str);
            if(mapOfStrings.containsKey(hashKey)){
                mapOfStrings.get(hashKey).add(str);
                continue;
            }
           List<String> list =new ArrayList<>();
            list.add(str);
            mapOfStrings.put(hashKey,list);
        }

        for(Map.Entry<String,List<String>> entry : mapOfStrings.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }

    public String hashKey(String str){
        int[] num = new int[26];

        for(int i =0 ; i<str.length();i++){
            num[str.charAt(i)-'a']++;
        }
        String result = "";
        for(int j = 0; j<26;j++){
            if(num[j]>0){
                result = result + num[j] + (char) ('a' + j);
            }
        }
        return result;
    }

    public List<List<String>> groupAnagrams(String[] strs,int a) {
        Map<String, List<String>> anagramMap=new HashMap<>();

        //Is anagram?
        for (int i=0;i<strs.length;i++){
            int[] arr = new int[26];
            for(int j = 0; j<strs[i].length();j++){
                int characterInt = strs[i].charAt(j) - 'a';
                arr[characterInt]++;
            }

            if(anagramMap.containsKey(Arrays.toString(arr))){
                List<String> objects = anagramMap.get(Arrays.toString(arr));
                objects.add(strs[i]);
                anagramMap.put(Arrays.toString(arr),objects);
            }else{
                List<String> objects = new ArrayList<>();
                objects.add(strs[i]);
                anagramMap.put(Arrays.toString(arr),objects);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : anagramMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
