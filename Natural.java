import java.util.*;
class Natural{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the natural you want the sum of: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            System.out.println("Your numbers are:"+i);
            sum=sum+i;
            System.out.println("sum: "+sum);
        }
    }
}