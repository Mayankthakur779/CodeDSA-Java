class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        int n=arr.length;
        for (int i=0 ;i<k;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        
        return arr[k-1];
    }
}
