package Recursion;

import java.util.Scanner;

public class OneTOn {

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n=sc.nextInt();

        print(n);

    }
    public static void print(int n){  

        if (n==0) return; //base case
        print(n-1);       //fn call
        System.out.println(n); //work
    
    }
    
}
