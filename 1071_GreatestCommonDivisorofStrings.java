/**
1071. Greatest Common Divisor of Strings
Easy
=========================================================================================
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
**/

public String gcdOfStrings(String str1, String str2) {
        String result = "";
        String solution  = "";
        int i = 0;
        while(i < str1.length() && i < str2.length()  && str1.charAt(i) == str2.charAt(i)){
            result = result + str1.charAt(i);
            int j = 0;
            boolean flag = true;

            if(str1.length() % result.length() == 0 && str2.length() % result.length() == 0){
                while(j < str1.length()){
                    String sub = str1.substring(j , j + result.length());
                    if(!sub.equals(result)){
                        flag = false;
                        break;
                    }
                    j = j + result.length();
                }
            

                boolean flag1 = true;
                j = 0;

                while(j < str2.length()){
                    String sub = str2.substring(j , j + result.length());
                    if(!sub.equals(result)){
                        flag1 = false;
                        break;
                    }
                    j = j + result.length();
                }

                if(flag1 && flag && result.length() > solution.length()){
                    solution = result;
                } 
            }
            i = i  + 1;
        }

        return solution;
    }
