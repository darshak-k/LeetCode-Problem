/**
6. Zigzag Conversion
Medium

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);
 

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", numRows = 1
Output: "A"
**/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() == 1){
            return s;
        }
        
        String result = "";
        
        List<String> list = new ArrayList<String>(numRows);
        for(int i  = 0; i < numRows; i++){
            list.add("");
        }
        
        int count = 0;
        boolean increment = true;
        for(int i = 0; i < s.length(); i++){
            list.set(count, list.get(count) + s.charAt(i));
            if(increment){
                count = count + 1;
            }
            else{
                count = count - 1;
            }
            
            if(count < 0){
                count = 1;
                increment = true;
            }
            else if(count == numRows){
                count = numRows - 2;
                increment = false;
            }
        }
        
        
        for(int i = 0; i < numRows; i++){
            result = result + list.get(i);
        }
        
        return result;
    }
}
