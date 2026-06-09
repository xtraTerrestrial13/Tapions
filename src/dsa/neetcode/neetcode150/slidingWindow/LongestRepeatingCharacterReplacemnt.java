package dsa.neetcode.neetcode150.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestRepeatingCharacterReplacemnt {


    public static void main(String[] args){
        LongestRepeatingCharacterReplacemnt longestRepeatingCharacterReplacemnt = new LongestRepeatingCharacterReplacemnt();
        System.out.println(longestRepeatingCharacterReplacemnt.characterReplacement1("ABAB", 2));
    }

    public int characterReplacement(String s, int k) {

        //Find longest substring with 2 characters only

        //K is no of replacement
        //k can be 0
        //k can be max string of length

        // Repeating Characters with -> replacement

        //Most Common character --

        // -> Find all substring of (k+1) unique characters


//Longest substring with k+1 characters -> But Highest character can have more than 1.

//Highest Count -> non repeating
// K count Repeating ->
//Unique (max -> K+1)

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> countMap = new HashMap<>();
            int maxF = 0;

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
                maxF = Math.max(maxF, countMap.get(ch));
                if ((j - i + 1) - maxF <= k) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }


    //The below solve might be wrong, coz i didn't test it.

    public int characterReplacement1(String s, int k) {


        int res =0;
        int left =0, right=0, maxF=0;
        Map<Character,Integer> set = new HashMap<>();
        while(right<s.length()){
            int subStringLength= right - left;
            if((subStringLength) - maxF <=k){
                set.put(s.charAt(right),set.getOrDefault(s.charAt(right),0)+1);
                res=Math.max(res,subStringLength);
                right++;
            }else{
                left = right;
            }
        }
        return res;
    }




}


