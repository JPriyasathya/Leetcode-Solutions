class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(hmap.containsKey(target - num))
            {
                return new int[]{i,hmap.get(target - num)};
            }
            hmap.put(num,i);
        }
        return new int[] {};
    }
}