class Solution {

    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer , Integer> map = new HashMap<>();
        int prefix =0;
        int count =0;
        map.put(0,1);
        for(int num : nums){

            prefix += num;

            if(map.containsKey(prefix-goal))
                count += map.get(prefix - goal);
            
            map.put(prefix , map.getOrDefault(prefix , 0) +1);
        }
        return count;
    }
}