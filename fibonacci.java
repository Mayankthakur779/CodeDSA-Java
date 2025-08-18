class fibonacci{
    public static void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfib(b,c,n-1);

    }
    public static void main(String args[]){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=8;
        printfib(a,b,n-2);// n-2 because we know 0,1 it will pass n=6

    }
    
}