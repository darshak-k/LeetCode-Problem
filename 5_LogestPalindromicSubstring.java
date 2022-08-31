/**
5. Longest Palindromic Substring
Medium
==================================================================================
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Example 2:

Input: s = "cbbd"
Output: "bb"

*/

public String longestPalindrome(String s) {
      String longest = s.substring(0, 1);

      for(int i  = 0; i < s.length(); i++){
          String current = getPalindrome(s, i, i);
          if(current.length() > longest.length()){
              longest = current;
          }

          current = getPalindrome(s, i, i + 1);
          if(current.length() > longest.length()){
              longest = current;
          }
      }

      return longest;
  }

  public String getPalindrome(String s, int begin, int end) {
      while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
          begin = begin - 1;
          end = end + 1;
      }

      return s.substring(begin + 1, end);
  }
