class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1 , 0 , merge , 0 , nums1.length);
        System.arraycopy(nums2 , 0 , merge , nums1.length , nums2.length);
        Arrays.sort(merge);
        int len=merge.length;
            if(len==2)
                return (double) (merge[0]+merge[1])/2;
            else if(len >2 && len%2==0)
                return (double) (merge[(len/2)-1]+merge[(len/2)])/2;
            else 
                return (double) merge[len/2];
        }
    }
