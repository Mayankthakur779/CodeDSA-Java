import java.util.*;
class Greater {
    public static void num(int n, int m) {
        if (n > m) {
            System.out.println(n + " is greater than " + m);
        } else if (m > n) {
            System.out.println(m + " is greater than " + n);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = sc.nextInt();
        System.out.print("Enter second number: ");
        int m = sc.nextInt();
        num(n, m);  
    }
}
