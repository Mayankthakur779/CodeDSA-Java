
public class Bubblesort{
public static void print(int []arr){
    for (int ele: arr){

        System.out.print(ele+" ");

    }
    System.out.println();
}

public static void bubble(int []arr){
    int n= arr.length;
    for (int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}


public static void main(String args[]){
    int arr[]={56,32,12,45,67,89,23};
    bubble(arr);
    print(arr);
    }
}
