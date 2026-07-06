class Solution {

    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canDivide(nums, threshold, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean canDivide(int[] nums, int threshold, int divisor) {

        int sum = 0;

        for (int num : nums) {

            sum += (num + divisor - 1) / divisor;

        }

        return sum <= threshold;
    }
}
