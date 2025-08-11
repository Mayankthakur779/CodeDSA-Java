import java.util.*;
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String sentence=sc.nextLine();
        StringBuilder sb=new StringBuilder(sentence);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);

        // String rev="";
        // for(int i=sentence.length()-1;i>=0;i--){
        //     rev=rev+sentendce.charAt(i);

        // }
        // System.out.println("Reversed String is:"+rev);

    }
}