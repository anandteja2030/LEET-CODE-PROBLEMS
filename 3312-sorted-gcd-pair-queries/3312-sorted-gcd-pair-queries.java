class Solution {

    public int[] gcdValues(int[] nums, long[] q) {

        int max = 0;

        for (int num : nums)
            max = Math.max(max, num);

        int[] frequency = new int[max + 1];

        for (int num : nums)
            frequency[num]++;

        long[] gcdCount = new long[max + 1];

        // Calculate number of pairs whose GCD is exactly gcd
        for (int gcd = max; gcd >= 1; gcd--) {

            long divisibleCount = 0;

            // Count numbers divisible by gcd
            for (int multiple = gcd; multiple <= max; multiple += gcd)
                divisibleCount += frequency[multiple];

            // Total pairs where both numbers are divisible by gcd
            gcdCount[gcd] = divisibleCount * (divisibleCount - 1) / 2;

            // Remove pairs having a greater GCD
            for (int multiple = gcd * 2; multiple <= max; multiple += gcd)
                gcdCount[gcd] -= gcdCount[multiple];
        }

        // Prefix count represents positions in sorted GCD array
        long[] prefix = new long[max + 1];

        for (int gcd = 1; gcd <= max; gcd++)
            prefix[gcd] = prefix[gcd - 1] + gcdCount[gcd];

        int[] result = new int[q.length];

        for (int i = 0; i < q.length; i++)
            result[i] = binarySearch(prefix, q[i]);

        return result;
    }

    private int binarySearch(long[] prefix, long query) {

        int left = 1;
        int right = prefix.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (prefix[mid] > query)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}