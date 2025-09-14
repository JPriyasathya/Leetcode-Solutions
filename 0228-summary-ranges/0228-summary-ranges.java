class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int start = i;
            while(i+1 < nums.length && nums[i+1] == nums[i]+1){
                i++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(nums[start]);
            if (start != i) {
                sb.append("->").append(nums[i]);
            }
            result.add(sb.toString());
        }
        return result;
    }
}