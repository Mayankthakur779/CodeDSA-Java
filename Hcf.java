package Recursion;
import java.util.*;

 public class Hcf{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the  first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b=sc.nextInt();

        System.out.println(gcd(a,b));
        
    }
    public static int gcd(int a ,int b){
        if (a == 0) return b;

        return gcd(b%a,a);
    }
}
