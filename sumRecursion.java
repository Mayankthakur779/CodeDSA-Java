class sumRecursion{
    public static void prinSum(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println("Sum is: " + sum);
            return;
        }
        sum+= i;
        prinSum(i+1,n,sum);
    }
    public static void main(String args[]){
        prinSum(1,5,0);
    }
}