import java.util.*;
public class Functions{
    public static void printMyname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        printMyname(name);
        sc.close();
    }
}