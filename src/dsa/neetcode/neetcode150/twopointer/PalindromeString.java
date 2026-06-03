package dsa.neetcode.neetcode150.twopointer;

public class PalindromeString {




    public boolean isPalindrome(String s) {
        int i = 0, j=s.length()-1;
        boolean jamun = true;
        while(i<j){

            while(i<j && !validate(s.charAt(i))){
                i++;
            }
            while(j>i && !validate( s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;
        }
        return jamun;
    }

    public boolean validate(char ch){
        if((ch >= 'a' && ch <='z') || (ch>='A'&&ch<='Z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }



    public static void main(String[] args){
            PalindromeString palindromeString = new PalindromeString();
            palindromeString.isPalindrome("Ab");

            Solution palin = new Solution();
            palin.isPalindrome("Ab");
    }





}

class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}