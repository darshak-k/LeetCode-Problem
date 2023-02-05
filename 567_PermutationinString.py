/**
'''
567. Permutation in String
Medium
=====================================================================================================
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
'''

**/

def checkInclusion(self, s1: str, s2: str) -> bool:
        s1 = [c for c in s1]
        s1.sort()
        s2 = [c for c in s2]
        for i in range(len(s2) - len(s1) + 1):
            s = s2[i: (i + len(s1))]
            s.sort()
            
            if(s == s1):
                return True
        return False
