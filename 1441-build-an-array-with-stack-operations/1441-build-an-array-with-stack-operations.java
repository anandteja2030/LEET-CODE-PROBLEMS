class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> res = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        for (int i : target)
            nums.add(i);

        for (int i = 1; i <= target[target.length - 1]; i++) {

            if (nums.contains(i))
                res.add("Push");
            else {
                res.add("Push");
                res.add("Pop");
            }
        }

        return res;
        
    }
}