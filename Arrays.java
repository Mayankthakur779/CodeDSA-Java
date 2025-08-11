import java.util.*;
class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int marks[]=new int[size];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=99;
        for(int j=0;j<size;j++){
            System.out.println("Enter the elements of the array:");
            marks[j]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(marks[i]+" ");
        }
    }
}