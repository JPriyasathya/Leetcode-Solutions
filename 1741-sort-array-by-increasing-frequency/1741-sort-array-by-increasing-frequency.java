class Solution {
    public int[] frequencySort(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Arrays.sort(arr,(a,b)->{
            return (map.get(a).equals(map.get(b))) ? (b-a) : (map.get(a)-map.get(b));
        });
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}