import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //descending order
        //to return kth maxm. element
        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}
