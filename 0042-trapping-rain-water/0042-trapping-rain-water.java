class Solution {
    public int trap(int[] nums) {
        if(nums.length <= 0)
            return 0;

    int leftmax =0 , rightmax=0;
    int st =0 , end=nums.length-1;
    int total =0;
    while(st <end){

        leftmax =Math.max(leftmax , nums[st]);
        rightmax=Math.max(rightmax , nums[end]);

        if(leftmax < rightmax)
            total+=leftmax-nums[st++];
        else
            total+=rightmax-nums[end--];
        
    }
    return total;
    }
}
