class recursion{
    //to print numbers from n to 1 using recursion
    public static void printNum(int n){
        // base case                            
        if(n==0){
            return;
        }
        System.out.println(n); 
        // recursive case
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNum(n);

    }
} 