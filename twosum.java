class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);
        
        while(i<j){
            if(arr[i]+arr[j]==target){
                return true;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            
        }
        return false;
        
    }
}
