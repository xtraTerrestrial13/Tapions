package dsa.neetcode.neetcode150.arraysAndHashing;

public class ValidAnagram {


    public static void main(String[] args){
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("carrace","racecar"));
    }


    /*
    Questions
    What happens in case of empty strings --> return true
    What happens for null strings --> return true
    Case Sensitivity? --> s and t will be lowercase
    will be difficult to handle special symbol --> won't handle
     */

    /*
    What is a valid anagram?
    same characters different ordering? --> Yes
    what if one more than character? --> Return false
     */


    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] countTable = new int[26];
        for(int i = 0; i<s.length();i++){
            countTable[s.charAt(i)-'a']++;
            countTable[t.charAt(i)-'a']--;
        }
        //used j for better readability
        for (int j : countTable) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }




}
