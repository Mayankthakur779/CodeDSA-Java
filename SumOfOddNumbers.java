public class SumOfOddNumbers {
    public static int sumOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;  // You can also take input from the user
        int result = sumOddNumbers(n);
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + result);
    }
}
