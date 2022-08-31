/**
4. Median of Two Sorted Arrays
Hard
==================================================================================================================

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

**/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        List<Integer> numbers = new ArrayList<Integer>();
        
        int median = (n1 + n2) / 2 + 1;
        int count = 0, i = 0, j = 0;
        double last = 0;
        while(count < median){
            if(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    numbers.add(nums1[i]);
                    i = i + 1;
                }
                else{
                    numbers.add(nums2[j]);
                    j = j + 1;
                }
            }
            else if(i < nums1.length){
                numbers.add(nums1[i]);
                i = i + 1;
            }else{
                numbers.add(nums2[j]);
                j = j + 1;
            }
            count = count + 1;
        }
        
        if((n1 + n2) % 2 == 1){
            return (double)numbers.get(numbers.size() - 1);
        }
        else{
            double d1 = (double)numbers.get(numbers.size() - 1);
            double d2 = (double)numbers.get(numbers.size() - 2);
            
            return (d1 + d2) / 2.0;
        }
    }
}
