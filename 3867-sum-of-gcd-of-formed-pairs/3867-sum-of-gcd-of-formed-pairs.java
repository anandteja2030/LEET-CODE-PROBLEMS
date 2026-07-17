class Solution {

    static int gcd(int a , int b){
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }
    public int[] gcdValues(int[] nums, long[] q) {
        List<Integer> list =  new ArrayList<>();

        for(int i =0  ; i<nums.length-1 ; i++){

            for(int j = i+1 ; j<nums.length ; j++)
                 list.add(gcd(nums[i] , nums[j]));
            
        }
        Collections.sort(list);
        int res[] = new int[q.length];

        for(int i =0 ; i<res.length ; i++)
            res[i] = list.get((int)q[i]);
        
        return res;
    }+
}
