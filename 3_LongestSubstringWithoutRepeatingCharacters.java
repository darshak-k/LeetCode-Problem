/**
3. Longest Substring Without Repeating Characters
Medium

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

**/


public int lengthOfLongestSubstring(String s) {
      int maxLength = 0;
      int lengthSoFar = 0;
      HashMap<Character, Integer> map = new HashMap<>();
      int previousIndex = 0;

      for(int i = 0; i < s.length(); i++){            
          if(map.containsKey(s.charAt(i))){
              previousIndex = Math.max(previousIndex, map.get(s.charAt(i)) + 1);
          }

          map.put(s.charAt(i), i);
          maxLength = Math.max(maxLength, i - previousIndex + 1);

      }

      return maxLength;
 }
