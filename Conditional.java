import java.util.*;
class Conditional{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter button number:");
        int button =sc.nextInt();
        switch(button){
            case 1:
            System.out.println("NAMASTE");
            break;
            case 2:
            System.out.println("Hello");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Invalid Button");
        }
    }
}