class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> h1=new HashSet<>();
        Set<Integer> h2= new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for(int i: nums1)
        {
            h1.add(i);
        }
        for(int i: nums2)
        {
            h2.add(i);
        }
        for(int i:h1)
        {
            if(!h2.contains(i))
            {
                ans.get(0).add(i);
            }
        }
        for(int i:h2)
        {
            if(!h1.contains(i))
            {
                ans.get(1).add(i);
            }
        }
        return ans;
    }
}