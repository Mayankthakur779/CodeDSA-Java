import java.util.*;
class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0,neg=0,zero=0;
        String ans="y";
        while(ans.equals("y")){
        System.out.println("Enter the number:");
        int num=sc.nextInt();
            if (num>0){
                System.out.println("The number enterer is positive.");
                pos=+1; 
            }
            else if(num<0){
                System.out.println("The number entered is negative.");
                neg=+1;
            }
            else if (num==0){
                System.out.println("The number entered is zero.");
                zero=+1;
            }
            System.out.println("Do you wnat to continue press y:");
            ans=sc.next();
        }
    System.out.println("Positive numbers: " + pos);
    System.out.println("Negative numbers: " + neg);
    System.out.println("Zeros: " + zero);
    }
}
