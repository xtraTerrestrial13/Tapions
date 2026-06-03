package dsa.neetcode.neetcode150.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args){
        LongestSubString longestSubString = new LongestSubString();
        System.out.println(longestSubString.lengthOfLongestSubstring(" "));
        System.out.println(longestSubString.lengthOfLongestSubstring2Pointer(" "));
//        System.out.println(longestSubString.lengthOfLongestSubstring2Map("abcabcbb"));
//        System.out.println(longestSubString.lengthOfLongestSubstring2Map(" "));
        System.out.println(longestSubString.lengthOfLongestSubstring1(" "));
    }

    public int lengthOfLongestSubstring(String s) {

        int maxString=0;
        int left =0, right =1;
        while(left<s.length()){

            HashSet<Character> set = new HashSet<>();
            //Add the first left character
            set.add(s.charAt(left));
            while(right<s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            maxString = Math.max(maxString,set.size());
            left++;
            right = left+1;
        }
        return maxString;
    }



    public int lengthOfLongestSubstring2Pointer(String s) {
        int maxString=0;

        Set<Character> set =new HashSet<>();
        int left =0 , right = 0;
        while(left<s.length() && right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
            }
            maxString = Math.max(maxString,right-left);

        }
        return maxString;
    }


    public int lengthOfLongestSubstring2Map(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int maxString = 0;
        int left = 0, right = 0;
        while (left < s.length() && right < s.length()) {

            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right), right);
            maxString = Math.max(maxString, right - left +1);
            right++;
        }
        return maxString;

    }

    public int lengthOfLongestSubstring1(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            if (mp.containsKey(s.charAt(r))) {
                l = Math.max(mp.get(s.charAt(r)) + 1, l);
            }
            mp.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}