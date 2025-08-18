class xpown_Recursion{
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;  // Base case: x^0 = 1
        }
        if(x==0){
            return 0;
        }
        int xpownm1=calcpower(x,n-1);
        int xpown= x * xpownm1;
        return xpown;
    }
    public static void main(String args[]){
        int x = 2; // Base number
        int n = 5; // Power
        int result = calcpower(x, n);
        System.out.println("Result of " + x + "^" + n + " is: " + result);
    }
}