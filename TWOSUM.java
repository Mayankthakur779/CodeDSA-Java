class Solution {
    //target
    //2 indices to check for sum and num are less then target
    //the 2num will be distinct 

    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for ( int i = 0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
            }
            return new int[]{-1, -1};
        }
        


    
    public static void main(String args[]){
    int nums[] = {23,4,56,3,24,6};
    int target = 7;

    Solution obj = new Solution();

    int[] ans = obj.twoSum(nums, target);

    System.out.println(Arrays.toString(ans));
    
}
}

    
