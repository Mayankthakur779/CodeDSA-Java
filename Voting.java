import java.util.*;
class Voting {
    public static int getAge(int age) {
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int result = getAge(age);
        System.out.println("Your age is: " + result);
        if (result >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
    }
}
