/**
20. Valid Parentheses
Easy
=====================================================================================================================
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

**/

public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            String t = s.charAt(i)+"";
            if(t.equals(")")){
                if(stack.size() > 0  && stack.peek().equals("(")){
                    stack.pop();
                }
                else{
                    return false;
                }
            } else if(t.equals("}")){
                if(stack.size() > 0  && stack.peek().equals("{")){
                    stack.pop();
                }
                else{
                    return false;
                }
            }else if(t.equals("]")){
                if(stack.size() > 0  && stack.peek().equals("[")){
                    stack.pop();
                }
                else{
                    return false;
                }
            } else{
                stack.push(t);
            }
        }
        if(stack.size() > 0){
            return false;
        }
        return true;
    }
