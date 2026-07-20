class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int r = 0;
        int temp = x;
        while(temp != 0)
        {
            r = (r*10)+(temp%10);
            temp /= 10;
        }
        return r == x;
    }
}