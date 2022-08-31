/*
2. Add Two Numbers
Medium
========================================================================================================================
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

*/

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l2 == null){
            return l1;
        }
        
        if(l1 == null){
            return l2;
        }
        
        ListNode finalList = null;
        ListNode currentNode = finalList;
        int bit = 0;
        while(l1 != null || l2 != null){
            int sum  = bit;
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            
            bit = sum / 10;
            
            if(currentNode == null){
                finalList = new ListNode(sum % 10);
                currentNode = finalList;
            }
            else {
                currentNode.next = new ListNode(sum % 10);
                currentNode = currentNode.next;
            }
            
           
        }
        
        if(bit == 1){
            currentNode.next = new ListNode(bit);
        }
        
        return finalList;
    }
