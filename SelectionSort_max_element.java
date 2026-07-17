// by finding the maximum element and placing it at the end of the array
class Selectionsort2{
    public static void main(String args[]){
        int arr[]={34,21,45,67,3,12,33};
        int n= arr.length;
        for (int i=n-1;i>0;i--){
            int max=i;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
