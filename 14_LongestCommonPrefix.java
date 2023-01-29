/**
14. Longest Common Prefix
Easy
============================================================================================
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

**/

public String longestCommonPrefix(String[] strs) {
    String result = strs[0];

    for(int i = 1; i < strs.length; i++){
        String temp = "";
        int j = 0;
        while(j < strs[i].length() && j < result.length() && result.charAt(j) == strs[i].charAt(j)){
            temp = temp + result.charAt(j);
            j = j + 1;
        }

        result = temp;
    }

    return result;
}
