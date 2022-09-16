/*
7. Reverse Integer
Medium
===============================================================================================================
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
*/

class Solution {
    public int reverse(int x) {
        int reverseX = 0;
        
        while(x != 0){
            int reminder = x % 10;
            x = x / 10;
            
            if (reverseX > Integer.MAX_VALUE/10 || (reverseX == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
            if (reverseX < Integer.MIN_VALUE/10 || (reverseX == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;
            
            reverseX = reverseX * 10 + reminder;
        }
        
        return reverseX;
    }
}
