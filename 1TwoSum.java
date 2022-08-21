/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(target - num)){
                int j = map.get(target- num);
                return new int[]{j, i};
            }
            else{
                map.put(num, i);
            }
        }
        return new int[]{-1, -1};
}
