class Solution {
    static int gcd(int a , int b){
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }
    public long gcdSum(int[] nums) {


        int pref[] = new int[nums.length];
        int max = nums[0];
        pref[0] = gcd(nums[0], max);

        for(int i =1 ; i<nums.length ; i++){
            max = Math.max(max , nums[i]);
            pref[i] = gcd(nums[i] , max);
        }

       Arrays.sort(pref);
       long sum =0 ;
       int left =0 ;
       int right = pref.length -1;

       while(left < right)
        sum += gcd(pref[left++] , pref[right--]);

    return sum;
       

    }
}