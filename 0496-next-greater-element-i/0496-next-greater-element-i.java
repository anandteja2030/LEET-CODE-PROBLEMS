class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> st= new Stack<>();
       HashMap<Integer , Integer> hm=new HashMap<>();
       for(int i=nums2.length-1 ; i>=0 ; i--){
        while(!st.isEmpty()&& nums2[i]>=st.peek()){
            st.pop();
        }
        if(st.isEmpty())
        hm.put(nums2[i] ,-1);
        else
        hm.put(nums2[i], st.peek());


        st.push(nums2[i]); 

       } 

        int res[]=new int[nums1.length];
        for(int i=0 ; i<nums1.length ; i++){
            if(hm.containsKey(nums1[i]))
            res[i]=hm.get(nums1[i]);
        }
        return res;
    }
}