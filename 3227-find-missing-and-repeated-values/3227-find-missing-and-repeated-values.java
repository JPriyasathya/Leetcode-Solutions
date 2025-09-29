class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> list=new ArrayList<>();
        for(int[] row:grid)
        {
            for(int val:row)
            {
                list.add(val);
            }
        }
        int n=list.size();
        Map<Integer,Integer> map=new HashMap<>();
        int missing=-1,duplicate=-1;
        for(int num:list)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=n;i++)
        {
            if(!map.containsKey(i))
            {
                missing=i;
            }
            else if(map.get(i)==2)
            {
                duplicate=i;
            }
        }
        return new int[]{duplicate,missing};

    }
}