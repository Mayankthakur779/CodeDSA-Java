class Solution {

    public int reverseExponentiation(int n) {

        int rev = reverse(n);

        return power(n, rev);
    }

    public int reverse(int n) {

        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        return rev;
    }

    public int power(int base, int exp) {

        if (exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }
}
