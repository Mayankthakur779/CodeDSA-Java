import java.util.*;
class Questions{
    public  static void main(String args[]){
        // 1.to print average
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a1=sc.nextInt();
        System.out.println("Enter second number:");
        int a2=sc.nextInt();
        System.out.println("Enter third number:");
        int a3=sc.nextInt();
        int avg=(a1+a2+a3)/3;
        System.out.println("average:"+avg);
    }
}